class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for(int num : nums) {
            if(even(num))
                count++;
        }
        
        return count;
    }
    
    static boolean even(int n) {
        int noOfDigits = digits(n);
        
        return noOfDigits % 2 == 0;
    }
    
    static int digits(int n) {
        if(n < 0) n = n * -1;
        int count = 0;
        
        while(n > 0) {
            count++;
            n = n / 10;
        }
        
        return count;
    }
}