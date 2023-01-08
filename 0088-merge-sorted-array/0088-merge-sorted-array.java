class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // [0,1,2,3,4,5]
        // [1,2,2,3,5,6]
        //  0  
        // [2,5,6]
        //  0  

        // [1] 1
        // [] 0
        int i = m - 1;
        int j = n - 1;

        while(i >= 0 && j >= 0) {
            if(nums1[i] >= nums2[j]) {
                nums1[i+j+1] = nums1[i];
                i--;
            } else {
                nums1[i+j+1] = nums2[j];
                j--;
            }
        }

        while(j >= 0) {
            nums1[j] = nums2[j];
            j--;
        }
    }
}