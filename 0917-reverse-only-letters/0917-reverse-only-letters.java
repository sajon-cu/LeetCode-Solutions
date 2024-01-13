class Solution {
public String reverseOnlyLetters(String s) {
        char[] letters = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = 0, j = letters.length - 1;

        while (i < j) {
            if(!Character.isAlphabetic(letters[i])) {
                i++;
            }

            if(!Character.isAlphabetic(letters[j])) {
                j--;
            }

            if(Character.isAlphabetic(letters[i]) && Character.isAlphabetic(letters[j])) {
                char temp = letters[i];
                letters[i] = letters[j];
                letters[j] = temp;
                i++;
                j--;
            }
        }

        for(char c : letters) {
            sb.append(c);
        }

        return sb.toString();
    }
}