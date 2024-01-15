class Solution {
    public int[] numberGame(int[] nums) {
        int[] res = nums;
        
        Arrays.sort(res);
        
        for(int i = 0; i < res.length - 1; i += 2) {
            swap(res, i, i + 1);
        }
        
        return res;
    }
    
    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}