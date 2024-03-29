class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        
        for(int i = 0; i < res.length; i++) {
            int count = 0;
            
            int j = i;
            while(j >0) {
                if(j % 2 == 1) {
                    count++;
                }
                j /= 2;
            }
            
            res[i] = count;
        }
        
        return res;
    }
}