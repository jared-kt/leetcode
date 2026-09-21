"""Smoke-test the installed runners: python3 test_run.py."""
from pathlib import Path
import json
import subprocess
import tempfile

runner = Path(__file__).with_name("run").resolve()
tasks = json.loads((runner.parent / ".zed/tasks.json").read_text())
gutter_tasks = [task for task in tasks if "kotlin-main" in task.get("tags", [])]
assert len(gutter_tasks) == 1, "Kotlin's gutter must use the project's runner"
task = gutter_tasks[0]
example = str(runner.parent / "array/Example.kt")
result = subprocess.run(
    [task["command"], *[arg.replace("$ZED_FILE", example) for arg in task["args"]]],
    cwd=task["cwd"].replace("$ZED_WORKTREE_ROOT", str(runner.parent)),
    text=True, capture_output=True,
)
assert result.returncode == 0, result.stderr
assert "All checks passed" in result.stdout, result.stdout
print("PASS Kotlin gutter task compiles and runs the example")
sources = {
    "Example.kt": 'fun main(args: Array<String>) { println(args[0] + readln()) }',
    "Example.kts": 'println(args[0] + readln())',
    "Example.java": 'class Example { public static void main(String[] args) { System.out.println(args[0] + new java.util.Scanner(System.in).nextLine()); } }',
    "example.py": 'import sys; print(sys.argv[1] + input())',
    "example.cpp": '#include <iostream>\n#include <string>\nint main(int, char** argv) { std::string s; std::getline(std::cin, s); std::cout << argv[1] << s << "\\n"; }',
}

with tempfile.TemporaryDirectory(prefix="practice runner ") as directory:
    root = Path(directory)
    for name, source in sources.items():
        path = root / name
        path.write_text(source)
        result = subprocess.run([str(runner), str(path), "hello "], input="world\n", text=True, capture_output=True)
        assert result.returncode == 0, result.stderr
        assert result.stdout == "hello world\n", result.stdout
        print(f"PASS {path.suffix}: paths with spaces, arguments, stdin, output")

    for name, source in {"fail.py": "assert False", "Fail.java": "class Fail { public static void main(String[] args) { assert false; } }", "broken.kt": "not valid Kotlin", "unsupported.txt": ""}.items():
        path = root / name
        path.write_text(source)
        assert subprocess.run([str(runner), str(path)], capture_output=True).returncode != 0, name
    assert subprocess.run([str(runner)], capture_output=True).returncode != 0
    assert subprocess.run([str(runner), str(root / "missing.py")], capture_output=True).returncode != 0
    print("PASS failure exits: assertions, compilation, unsupported/missing files, usage")
