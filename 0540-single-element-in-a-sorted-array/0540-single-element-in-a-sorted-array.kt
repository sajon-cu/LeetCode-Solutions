class Solution {
    fun singleNonDuplicate(nums: IntArray): Int {
        val size = nums.size
        
        if(size == 1) return nums[0]
        
        var i = 0
        var res: Int = 0
        
        while(i < size - 1) {
            if(nums[i] == nums[i+1]) {
                i += 2
            } else {
                return nums[i]
            }
        }
        
        return nums[i]
    }
}