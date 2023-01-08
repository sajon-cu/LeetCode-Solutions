class Solution {
    fun isPalindrome(x: Int): Boolean {
        var tempX = x
        var reversed = 0

        while(tempX > 0) {
            var rem = tempX % 10
            reversed = (reversed * 10) + rem
            tempX /= 10
        }

        return reversed == x
    }
}