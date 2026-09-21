// 49. Group Anagrams — Medium
// https://leetcode.com/problems/group-anagrams/
// Implement the class below. Tests and helpers are not part of your submission.
package neetcode.p0049

import practice.*

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        TODO("Implement groupAnagrams")
    }
}

fun main() {
    runTests(
        "case 1: arrayOf(\"ab\", \"ba\", \"cat\", \"act\", \"x\")" to {
            expectGroups(listOf(listOf("ab", "ba"), listOf("cat", "act"), listOf("x")), Solution().groupAnagrams(arrayOf("ab", "ba", "cat", "act", "x")))
        },
        "case 2: arrayOf(\"\")" to {
            expectGroups(listOf(listOf("")), Solution().groupAnagrams(arrayOf("")))
        },
        "case 3: arrayOf(\"a\", \"a\", \"b\")" to {
            expectGroups(listOf(listOf("a", "a"), listOf("b")), Solution().groupAnagrams(arrayOf("a", "a", "b")))
        },
    )
}
