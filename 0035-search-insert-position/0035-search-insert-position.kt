class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        
        return searchIndex(nums, 0, nums.size, target)
    }
    
    private fun searchIndex(nums: IntArray, start: Int, end: Int, target: Int): Int {
        var mStart = start
        var mEnd = end
        
        while(mStart < mEnd) {
            val mid = (mStart+mEnd) / 2
            
            if(target == nums[mid]) {
                return mid
            }
            else if(target > nums[mid]) {
                mStart = mid + 1;
            } else {
                mEnd = mid
            }
        }
        
        return mStart
    }
    
}