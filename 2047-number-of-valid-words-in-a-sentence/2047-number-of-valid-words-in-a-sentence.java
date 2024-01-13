class Solution {
    
    public int countValidWords(String sentences) {
        int count = 0;
        String[] words = sentences.strip().split("\\s+");

        for(String word : words) {
            if(isWordValid(word))
                count++;
        }

        return count;
    }

    public boolean isWordValid(String word) {
        // char[] chars = word.toCharArray();
        int hyphenCount = 0;

        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(Character.isDigit(ch))  return false;
            if(Character.isLowerCase(ch)) continue;
            
            if(ch == '-') {
                if(++hyphenCount > 1) return false;
                if(i - 1 < 0 || !Character.isLowerCase(word.charAt(i - 1)) || i + 1 >= word.length() || !Character.isLowerCase(word.charAt(i + 1)))
                    return false;
            } else if (i != word.length() - 1) {
                return false;
            }
        }

        return true;
    }
}