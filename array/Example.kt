// Copy this file for a new question. Keep your LeetCode solution in this class.
private class Solution {
    fun solve(nums: IntArray): Int = nums.sum()
}

fun main() {
    val solution = Solution()
    val actual = solution.solve(intArrayOf(1, 2, 3))
    println("Output: $actual")
    check(actual == 6) { "Expected 6, got $actual" }
    check(solution.solve(intArrayOf()) == 0)
    println("All checks passed")
}
