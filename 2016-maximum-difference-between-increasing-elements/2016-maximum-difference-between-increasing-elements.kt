class Solution {
    fun maximumDifference(nums: IntArray): Int {
        var i = 0
        var j = 1
        var max = -1
        
        while(j < nums.size) {
            if(nums[i] < nums[j]) {
                max = Math.max(max, nums[j] - nums[i])
                j++
            } else {
                i = j
                j++
            }
        }
        
        return max;
    }
}