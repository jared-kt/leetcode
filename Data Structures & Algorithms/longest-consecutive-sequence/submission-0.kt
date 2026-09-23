class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return 1
        val union = Union(nums.toSet().toIntArray())
        return union.size.max()
    }
}

class Union(val nums: IntArray) {
    val arr = nums.copyOf()
    val valueIndexMap = HashMap<Int, Int>(nums.size)

    // Initially treat each element as a unique node, with itself being a parent


    // Initial Size array to calculate largest tree based on merge size
    val size = IntArray(nums.size) { 1 }
    val parent = IntArray(nums.size) { it }

    init {
        build()
    }


    private fun build() {
        arr.forEachIndexed { index, value ->
            valueIndexMap[value] = index
        }

        arr.forEachIndexed { index, value ->
            valueIndexMap[value - 1]?.let { previousIndex ->
                merge(index, previousIndex)
            }
        }

    }

    private fun merge(x: Int, y: Int) {
        val parentX = find(x)
        val sizeX = size[parentX]

        val parentY = find(y)
        val sizeY = size[parentY]

        // Merge y into x
        if (sizeX > sizeY) {
            parent[parentY] = parentX
            size[parentX] += size[parentY]
            return
        }

        // Merge x into y
        parent[parentX] = parentY
        size[parentY] += size[parentX]

    }

    // Find a value & get its root
    private fun find(x: Int): Int {
        // Run path-compression
        if (parent[x] != x) {
            parent[x] = find(parent[x])
        }

        return parent[x]
    }
    }
