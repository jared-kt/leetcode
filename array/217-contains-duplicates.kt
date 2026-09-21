private class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {

        nums.forEach
        {
            if (res.contains(it)) return true
            res.add(it)
        }

        return false
    }
}

fun main() {
    val solution = Solution()
    val test1 = solution.containsDuplicate(intArrayOf(1, 2, 3, 1))
    println("Output: $test1")

}
