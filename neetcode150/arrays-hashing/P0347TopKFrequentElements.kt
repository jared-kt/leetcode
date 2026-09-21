// 347. Top K Frequent Elements — Medium
// https://leetcode.com/problems/top-k-frequent-elements/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0347

import practice.*

class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        TODO("Implement topKFrequent")
    }
}

fun main() {
    runTests(
        "case 1: intArrayOf(4, 4, 4, 2, 2, 9), 2" to {
            expectUnordered(intArrayOf(4, 2), Solution().topKFrequent(intArrayOf(4, 4, 4, 2, 2, 9), 2))
        },
        "case 2: intArrayOf(-1), 1" to {
            expectUnordered(intArrayOf(-1), Solution().topKFrequent(intArrayOf(-1), 1))
        },
        "case 3: intArrayOf(1, 2, 3), 3" to {
            expectUnordered(intArrayOf(1, 2, 3), Solution().topKFrequent(intArrayOf(1, 2, 3), 3))
        },
    )
}
