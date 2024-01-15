class Solution {
//     public int findFinalValue(int[] nums, int original) {
//         Set set = new HashSet();
//         // Arrays.sort(nums);
        
//         for(int i : nums) {
//             if(i == original) {
//                 original *= 2; 
//             }
//         }
        
//         return original;
//     }
    
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums)
            if(i >= original)
                set.add(i);
        while(true)
            if(set.contains(original))
                original *= 2;
            else
                break;
        return original;
    }
}