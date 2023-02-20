class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
//         val res = nums.map { num ->
//             num*num
//         }.toIntArray()
        
//         res.sort()
//         return res
        
        val size = nums.size
        val res = IntArray(size)
        var i = 0
        var j = size - 1
        
        for (ii in size - 1 downTo 0) {
            if(Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[ii] = nums[i] * nums[i]
                i++
            } else {
                res[ii] = nums[j] * nums[j]
                j--
            }
        }
        
        return res
    }
}

