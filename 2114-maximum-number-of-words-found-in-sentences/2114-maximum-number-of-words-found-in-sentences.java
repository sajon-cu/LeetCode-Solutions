class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        
        for(String sentence : sentences) {
            max = Math.max(max, countWord(sentence));
        }
        
        return max;
    }
    
    private int countWord(String sentence) {
        char[] chrs = sentence.toCharArray();
        
        int count = 0;
        
        for(char c : chrs) {
            if(c == ' ') {
                count++;
            }
        }
        
        System.out.println(count);
        
        return ++count;
    }
}