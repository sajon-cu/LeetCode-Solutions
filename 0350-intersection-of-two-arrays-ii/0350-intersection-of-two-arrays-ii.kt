class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val frequency: HashMap<Int, Int> = HashMap<Int, Int> ()
        val resList = mutableListOf<Int>()
        
        for(num in nums1) {
            frequency[num] = (frequency[num] ?: 0) + 1
        }
        
        for(num in nums2) {
            val value = frequency.get(num)
            if(value!= null && value > 0) {
                frequency[num] = value - 1
                resList.add(num)
            }
        }
        
        return resList.toIntArray()
    }
}