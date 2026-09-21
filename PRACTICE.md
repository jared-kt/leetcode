# Interview practice

The [NeetCode 150 index](neetcode150/README.md) links to all Kotlin skeletons and
their runnable tests. Start with:

```sh
./run neetcode150/arrays-hashing/P0217ContainsDuplicate.kt
```

Fill in the `TODO()` methods, then use the gutter play button or **Cmd+Shift+R**
in Zed. Each run reports passing, failing, and unfinished test cases.

Open this folder in Zed: `zed /Users/jared/repos/leetcode`.

`./run <file>` detects the language from the extension. Supported: Kotlin `.kt`
and `.kts`, Java `.java`, Python `.py`, and C++ `.cpp`, `.cc`, `.cxx`, `.cp`.
Each file must be runnable: `fun main()` for Kotlin, `static void main` for Java,
`int main()` for C++, or top-level Python code. Kotlin scripts run top-level code.

Copy `array/Example.kt` to a new `.kt` file for each question. Put your solution
in `private class Solution` and your sample inputs, `println` calls, and `check`
assertions in `fun main()`. Private classes keep identical solution names from
conflicting in the editor. Remove `private` when submitting the class to LeetCode;
do not submit `main()`.

Run from this directory:

```sh
./run array/Example.kt
./run array/Question.java
./run array/question.py
./run array/question.cpp
```
