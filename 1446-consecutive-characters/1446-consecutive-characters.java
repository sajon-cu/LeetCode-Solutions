class Solution {
    public int maxPower(String s) {
        int max = Integer.MIN_VALUE;
        
        char[] chArr = s.toCharArray();
        
        int count = 1;
        
        for(int i = 1; i <= chArr.length-1; i++) {
            System.out.println(i + " " + count);
            System.out.println(i + " " + (i-1));
            if(chArr[i] == chArr[i - 1]) {
                count++;
                max = Math.max(max, count);
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        
        return Math.max(max, count);
    }
}