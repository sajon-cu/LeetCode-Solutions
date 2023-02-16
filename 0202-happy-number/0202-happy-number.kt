class Solution {
    val memo = hashSetOf<Int>();
    
    fun isHappy(n: Int): Boolean {
        return if(n != 1 && !memo.contains(n)) {
            memo.add(n)
            val sumOfDigits = getSumOf(n)
            isHappy(sumOfDigits)
        } else {
            if(n == 1) true else false
        }
    }
    
    
    fun getSumOf(n: Int): Int {
        var m = n
        var sum = 0;
        
        while(m != 0) {
            var rem = (m % 10)
            sum = sum + (rem*rem)
            m /= 10
        }
        
        return sum
    }
}