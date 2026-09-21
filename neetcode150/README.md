# NeetCode 150 — Kotlin practice

Implement the class in each file, then run it with `./run neetcode150/<topic>/<file>.kt` from the repository root, or use Zed’s gutter play button / **Cmd+Shift+R**.

Each method starts as `TODO()`. Tests report **TODO**, **PASS**, or **FAIL**, and unfinished or failed suites exit nonzero. Test cases cover examples and edge cases, but are not a replacement for LeetCode’s hidden tests or performance limits.

For submission, copy only the problem class (normally `Solution`; design problems use names such as `LRUCache`). Omit the package, `practice` imports, and `main`. LeetCode provides its own node types. Encode/Decode Strings uses `Solution.encode/decode` as on NeetCode; LeetCode 271 calls that class `Codec`. Meeting Rooms uses the LeetCode `Array<IntArray>` interface.

Shared builders and assertions live in `support/TestSupport.kt`; `./run` includes them automatically. Node classes expose LeetCode’s backticked `val` field. Each file has its own package to prevent editor name collisions.

The existing `array/217-contains-duplicates.kt` is preserved separately.

List verified against [NeetCode’s official problem data](https://github.com/neetcode-gh/leetcode/blob/main/.problemSiteData.json) on 2026-09-20. Test inputs and checks were authored for this workspace.

Run `python3 neetcode150/check_scaffolds.py` to compile every skeleton and check test-harness health. It does not solve the exercises.

## Arrays & Hashing

- [ ] [217. Contains Duplicate](arrays-hashing/P0217ContainsDuplicate.kt) — Easy
- [ ] [242. Valid Anagram](arrays-hashing/P0242ValidAnagram.kt) — Easy
- [ ] [1. Two Sum](arrays-hashing/P0001TwoSum.kt) — Easy
- [ ] [49. Group Anagrams](arrays-hashing/P0049GroupAnagrams.kt) — Medium
- [ ] [347. Top K Frequent Elements](arrays-hashing/P0347TopKFrequentElements.kt) — Medium
- [ ] [238. Product of Array Except Self](arrays-hashing/P0238ProductOfArrayExceptSelf.kt) — Medium
- [ ] [36. Valid Sudoku](arrays-hashing/P0036ValidSudoku.kt) — Medium
- [ ] [271. Encode and Decode Strings](arrays-hashing/P0271EncodeAndDecodeStrings.kt) — Medium
- [ ] [128. Longest Consecutive Sequence](arrays-hashing/P0128LongestConsecutiveSequence.kt) — Medium
## Two Pointers

- [ ] [125. Valid Palindrome](two-pointers/P0125ValidPalindrome.kt) — Easy
- [ ] [167. Two Sum II Input Array Is Sorted](two-pointers/P0167TwoSumIiInputArrayIsSorted.kt) — Medium
- [ ] [15. 3Sum](two-pointers/P00153Sum.kt) — Medium
- [ ] [11. Container With Most Water](two-pointers/P0011ContainerWithMostWater.kt) — Medium
- [ ] [42. Trapping Rain Water](two-pointers/P0042TrappingRainWater.kt) — Hard
## Sliding Window

- [ ] [121. Best Time to Buy And Sell Stock](sliding-window/P0121BestTimeToBuyAndSellStock.kt) — Easy
- [ ] [3. Longest Substring Without Repeating Characters](sliding-window/P0003LongestSubstringWithoutRepeatingCharacters.kt) — Medium
- [ ] [424. Longest Repeating Character Replacement](sliding-window/P0424LongestRepeatingCharacterReplacement.kt) — Medium
- [ ] [567. Permutation In String](sliding-window/P0567PermutationInString.kt) — Medium
- [ ] [76. Minimum Window Substring](sliding-window/P0076MinimumWindowSubstring.kt) — Hard
- [ ] [239. Sliding Window Maximum](sliding-window/P0239SlidingWindowMaximum.kt) — Hard
## Stack

- [ ] [20. Valid Parentheses](stack/P0020ValidParentheses.kt) — Easy
- [ ] [155. Min Stack](stack/P0155MinStack.kt) — Medium
- [ ] [150. Evaluate Reverse Polish Notation](stack/P0150EvaluateReversePolishNotation.kt) — Medium
- [ ] [22. Generate Parentheses](stack/P0022GenerateParentheses.kt) — Medium
- [ ] [739. Daily Temperatures](stack/P0739DailyTemperatures.kt) — Medium
- [ ] [853. Car Fleet](stack/P0853CarFleet.kt) — Medium
- [ ] [84. Largest Rectangle In Histogram](stack/P0084LargestRectangleInHistogram.kt) — Hard
## Binary Search

- [ ] [704. Binary Search](binary-search/P0704BinarySearch.kt) — Easy
- [ ] [74. Search a 2D Matrix](binary-search/P0074SearchA2DMatrix.kt) — Medium
- [ ] [875. Koko Eating Bananas](binary-search/P0875KokoEatingBananas.kt) — Medium
- [ ] [153. Find Minimum In Rotated Sorted Array](binary-search/P0153FindMinimumInRotatedSortedArray.kt) — Medium
- [ ] [33. Search In Rotated Sorted Array](binary-search/P0033SearchInRotatedSortedArray.kt) — Medium
- [ ] [981. Time Based Key Value Store](binary-search/P0981TimeBasedKeyValueStore.kt) — Medium
- [ ] [4. Median of Two Sorted Arrays](binary-search/P0004MedianOfTwoSortedArrays.kt) — Hard
## Linked List

- [ ] [206. Reverse Linked List](linked-list/P0206ReverseLinkedList.kt) — Easy
- [ ] [21. Merge Two Sorted Lists](linked-list/P0021MergeTwoSortedLists.kt) — Easy
- [ ] [143. Reorder List](linked-list/P0143ReorderList.kt) — Medium
- [ ] [19. Remove Nth Node From End of List](linked-list/P0019RemoveNthNodeFromEndOfList.kt) — Medium
- [ ] [138. Copy List With Random Pointer](linked-list/P0138CopyListWithRandomPointer.kt) — Medium
- [ ] [2. Add Two Numbers](linked-list/P0002AddTwoNumbers.kt) — Medium
- [ ] [141. Linked List Cycle](linked-list/P0141LinkedListCycle.kt) — Easy
- [ ] [287. Find The Duplicate Number](linked-list/P0287FindTheDuplicateNumber.kt) — Medium
- [ ] [146. LRU Cache](linked-list/P0146LruCache.kt) — Medium
- [ ] [23. Merge K Sorted Lists](linked-list/P0023MergeKSortedLists.kt) — Hard
- [ ] [25. Reverse Nodes In K Group](linked-list/P0025ReverseNodesInKGroup.kt) — Hard
## Trees

- [ ] [226. Invert Binary Tree](trees/P0226InvertBinaryTree.kt) — Easy
- [ ] [104. Maximum Depth of Binary Tree](trees/P0104MaximumDepthOfBinaryTree.kt) — Easy
- [ ] [543. Diameter of Binary Tree](trees/P0543DiameterOfBinaryTree.kt) — Easy
- [ ] [110. Balanced Binary Tree](trees/P0110BalancedBinaryTree.kt) — Easy
- [ ] [100. Same Tree](trees/P0100SameTree.kt) — Easy
- [ ] [572. Subtree of Another Tree](trees/P0572SubtreeOfAnotherTree.kt) — Easy
- [ ] [235. Lowest Common Ancestor of a Binary Search Tree](trees/P0235LowestCommonAncestorOfABinarySearchTree.kt) — Medium
- [ ] [102. Binary Tree Level Order Traversal](trees/P0102BinaryTreeLevelOrderTraversal.kt) — Medium
- [ ] [199. Binary Tree Right Side View](trees/P0199BinaryTreeRightSideView.kt) — Medium
- [ ] [1448. Count Good Nodes In Binary Tree](trees/P1448CountGoodNodesInBinaryTree.kt) — Medium
- [ ] [98. Validate Binary Search Tree](trees/P0098ValidateBinarySearchTree.kt) — Medium
- [ ] [230. Kth Smallest Element In a Bst](trees/P0230KthSmallestElementInABst.kt) — Medium
- [ ] [105. Construct Binary Tree From Preorder And Inorder Traversal](trees/P0105ConstructBinaryTreeFromPreorderAndInorderTraversal.kt) — Medium
- [ ] [124. Binary Tree Maximum Path Sum](trees/P0124BinaryTreeMaximumPathSum.kt) — Hard
- [ ] [297. Serialize And Deserialize Binary Tree](trees/P0297SerializeAndDeserializeBinaryTree.kt) — Hard
## Tries

- [ ] [208. Implement Trie Prefix Tree](tries/P0208ImplementTriePrefixTree.kt) — Medium
- [ ] [211. Design Add And Search Words Data Structure](tries/P0211DesignAddAndSearchWordsDataStructure.kt) — Medium
- [ ] [212. Word Search II](tries/P0212WordSearchIi.kt) — Hard
## Heap / Priority Queue

- [ ] [703. Kth Largest Element In a Stream](heap-priority-queue/P0703KthLargestElementInAStream.kt) — Easy
- [ ] [1046. Last Stone Weight](heap-priority-queue/P1046LastStoneWeight.kt) — Easy
- [ ] [973. K Closest Points to Origin](heap-priority-queue/P0973KClosestPointsToOrigin.kt) — Medium
- [ ] [215. Kth Largest Element In An Array](heap-priority-queue/P0215KthLargestElementInAnArray.kt) — Medium
- [ ] [621. Task Scheduler](heap-priority-queue/P0621TaskScheduler.kt) — Medium
- [ ] [355. Design Twitter](heap-priority-queue/P0355DesignTwitter.kt) — Medium
- [ ] [295. Find Median From Data Stream](heap-priority-queue/P0295FindMedianFromDataStream.kt) — Hard
## Backtracking

- [ ] [78. Subsets](backtracking/P0078Subsets.kt) — Medium
- [ ] [39. Combination Sum](backtracking/P0039CombinationSum.kt) — Medium
- [ ] [46. Permutations](backtracking/P0046Permutations.kt) — Medium
- [ ] [90. Subsets II](backtracking/P0090SubsetsIi.kt) — Medium
- [ ] [40. Combination Sum II](backtracking/P0040CombinationSumIi.kt) — Medium
- [ ] [79. Word Search](backtracking/P0079WordSearch.kt) — Medium
- [ ] [131. Palindrome Partitioning](backtracking/P0131PalindromePartitioning.kt) — Medium
- [ ] [17. Letter Combinations of a Phone Number](backtracking/P0017LetterCombinationsOfAPhoneNumber.kt) — Medium
- [ ] [51. N Queens](backtracking/P0051NQueens.kt) — Hard
## Graphs

- [ ] [200. Number of Islands](graphs/P0200NumberOfIslands.kt) — Medium
- [ ] [133. Clone Graph](graphs/P0133CloneGraph.kt) — Medium
- [ ] [695. Max Area of Island](graphs/P0695MaxAreaOfIsland.kt) — Medium
- [ ] [417. Pacific Atlantic Water Flow](graphs/P0417PacificAtlanticWaterFlow.kt) — Medium
- [ ] [130. Surrounded Regions](graphs/P0130SurroundedRegions.kt) — Medium
- [ ] [994. Rotting Oranges](graphs/P0994RottingOranges.kt) — Medium
- [ ] [286. Walls And Gates](graphs/P0286WallsAndGates.kt) — Medium
- [ ] [207. Course Schedule](graphs/P0207CourseSchedule.kt) — Medium
- [ ] [210. Course Schedule II](graphs/P0210CourseScheduleIi.kt) — Medium
- [ ] [684. Redundant Connection](graphs/P0684RedundantConnection.kt) — Medium
- [ ] [323. Number of Connected Components In An Undirected Graph](graphs/P0323NumberOfConnectedComponentsInAnUndirectedGraph.kt) — Medium
- [ ] [261. Graph Valid Tree](graphs/P0261GraphValidTree.kt) — Medium
- [ ] [127. Word Ladder](graphs/P0127WordLadder.kt) — Hard
## Advanced Graphs

- [ ] [332. Reconstruct Itinerary](advanced-graphs/P0332ReconstructItinerary.kt) — Hard
- [ ] [1584. Min Cost to Connect All Points](advanced-graphs/P1584MinCostToConnectAllPoints.kt) — Medium
- [ ] [743. Network Delay Time](advanced-graphs/P0743NetworkDelayTime.kt) — Medium
- [ ] [778. Swim In Rising Water](advanced-graphs/P0778SwimInRisingWater.kt) — Hard
- [ ] [269. Alien Dictionary](advanced-graphs/P0269AlienDictionary.kt) — Hard
- [ ] [787. Cheapest Flights Within K Stops](advanced-graphs/P0787CheapestFlightsWithinKStops.kt) — Medium
## 1-D Dynamic Programming

- [ ] [70. Climbing Stairs](1-d-dynamic-programming/P0070ClimbingStairs.kt) — Easy
- [ ] [746. Min Cost Climbing Stairs](1-d-dynamic-programming/P0746MinCostClimbingStairs.kt) — Easy
- [ ] [198. House Robber](1-d-dynamic-programming/P0198HouseRobber.kt) — Medium
- [ ] [213. House Robber II](1-d-dynamic-programming/P0213HouseRobberIi.kt) — Medium
- [ ] [5. Longest Palindromic Substring](1-d-dynamic-programming/P0005LongestPalindromicSubstring.kt) — Medium
- [ ] [647. Palindromic Substrings](1-d-dynamic-programming/P0647PalindromicSubstrings.kt) — Medium
- [ ] [91. Decode Ways](1-d-dynamic-programming/P0091DecodeWays.kt) — Medium
- [ ] [322. Coin Change](1-d-dynamic-programming/P0322CoinChange.kt) — Medium
- [ ] [152. Maximum Product Subarray](1-d-dynamic-programming/P0152MaximumProductSubarray.kt) — Medium
- [ ] [139. Word Break](1-d-dynamic-programming/P0139WordBreak.kt) — Medium
- [ ] [300. Longest Increasing Subsequence](1-d-dynamic-programming/P0300LongestIncreasingSubsequence.kt) — Medium
- [ ] [416. Partition Equal Subset Sum](1-d-dynamic-programming/P0416PartitionEqualSubsetSum.kt) — Medium
## 2-D Dynamic Programming

- [ ] [62. Unique Paths](2-d-dynamic-programming/P0062UniquePaths.kt) — Medium
- [ ] [1143. Longest Common Subsequence](2-d-dynamic-programming/P1143LongestCommonSubsequence.kt) — Medium
- [ ] [309. Best Time to Buy And Sell Stock With Cooldown](2-d-dynamic-programming/P0309BestTimeToBuyAndSellStockWithCooldown.kt) — Medium
- [ ] [518. Coin Change II](2-d-dynamic-programming/P0518CoinChangeIi.kt) — Medium
- [ ] [494. Target Sum](2-d-dynamic-programming/P0494TargetSum.kt) — Medium
- [ ] [97. Interleaving String](2-d-dynamic-programming/P0097InterleavingString.kt) — Medium
- [ ] [329. Longest Increasing Path In a Matrix](2-d-dynamic-programming/P0329LongestIncreasingPathInAMatrix.kt) — Hard
- [ ] [115. Distinct Subsequences](2-d-dynamic-programming/P0115DistinctSubsequences.kt) — Hard
- [ ] [72. Edit Distance](2-d-dynamic-programming/P0072EditDistance.kt) — Medium
- [ ] [312. Burst Balloons](2-d-dynamic-programming/P0312BurstBalloons.kt) — Hard
- [ ] [10. Regular Expression Matching](2-d-dynamic-programming/P0010RegularExpressionMatching.kt) — Hard
## Greedy

- [ ] [53. Maximum Subarray](greedy/P0053MaximumSubarray.kt) — Medium
- [ ] [55. Jump Game](greedy/P0055JumpGame.kt) — Medium
- [ ] [45. Jump Game II](greedy/P0045JumpGameIi.kt) — Medium
- [ ] [134. Gas Station](greedy/P0134GasStation.kt) — Medium
- [ ] [846. Hand of Straights](greedy/P0846HandOfStraights.kt) — Medium
- [ ] [1899. Merge Triplets to Form Target Triplet](greedy/P1899MergeTripletsToFormTargetTriplet.kt) — Medium
- [ ] [763. Partition Labels](greedy/P0763PartitionLabels.kt) — Medium
- [ ] [678. Valid Parenthesis String](greedy/P0678ValidParenthesisString.kt) — Medium
## Intervals

- [ ] [57. Insert Interval](intervals/P0057InsertInterval.kt) — Medium
- [ ] [56. Merge Intervals](intervals/P0056MergeIntervals.kt) — Medium
- [ ] [435. Non Overlapping Intervals](intervals/P0435NonOverlappingIntervals.kt) — Medium
- [ ] [252. Meeting Rooms](intervals/P0252MeetingRooms.kt) — Easy
- [ ] [253. Meeting Rooms II](intervals/P0253MeetingRoomsIi.kt) — Medium
- [ ] [1851. Minimum Interval to Include Each Query](intervals/P1851MinimumIntervalToIncludeEachQuery.kt) — Hard
## Math & Geometry

- [ ] [48. Rotate Image](math-geometry/P0048RotateImage.kt) — Medium
- [ ] [54. Spiral Matrix](math-geometry/P0054SpiralMatrix.kt) — Medium
- [ ] [73. Set Matrix Zeroes](math-geometry/P0073SetMatrixZeroes.kt) — Medium
- [ ] [202. Happy Number](math-geometry/P0202HappyNumber.kt) — Easy
- [ ] [66. Plus One](math-geometry/P0066PlusOne.kt) — Easy
- [ ] [50. Pow(x, n)](math-geometry/P0050PowxN.kt) — Medium
- [ ] [43. Multiply Strings](math-geometry/P0043MultiplyStrings.kt) — Medium
- [ ] [2013. Detect Squares](math-geometry/P2013DetectSquares.kt) — Medium
## Bit Manipulation

- [ ] [136. Single Number](bit-manipulation/P0136SingleNumber.kt) — Easy
- [ ] [191. Number of 1 Bits](bit-manipulation/P0191NumberOf1Bits.kt) — Easy
- [ ] [338. Counting Bits](bit-manipulation/P0338CountingBits.kt) — Easy
- [ ] [190. Reverse Bits](bit-manipulation/P0190ReverseBits.kt) — Easy
- [ ] [268. Missing Number](bit-manipulation/P0268MissingNumber.kt) — Easy
- [ ] [371. Sum of Two Integers](bit-manipulation/P0371SumOfTwoIntegers.kt) — Medium
- [ ] [7. Reverse Integer](bit-manipulation/P0007ReverseInteger.kt) — Medium
