class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] res = {-1, Integer.MIN_VALUE};
        
        for(int i = 0; i < mat.length; i++) {
            int noOfOnes = countOnes(mat[i]);
            
            if(res[1] < noOfOnes) {
                res[0] = i;
                res[1] = noOfOnes;
            }
        }
        
        return res;
    }
    
    static int countOnes(int[] mat) {
        int count = 0;
        
        for(int m : mat) {
            if(m == 1) {
                count++;
            }
        }
        
        return count;
    }
}