class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        val res = nums.map { num ->
            num*num
        }.toIntArray()
        
        res.sort()
        return res
    }
}