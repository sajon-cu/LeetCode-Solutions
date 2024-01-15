class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split("\\s");
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i <= k - 1; i++) {
            if(i == k - 1) {
                sb.append(words[i]);
            } else {
                sb.append(words[i]+" ");
            }
        }
        
        return sb.toString();
    }
}