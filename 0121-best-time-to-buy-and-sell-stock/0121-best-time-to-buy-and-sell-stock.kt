class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = Integer.MAX_VALUE
        var maxProfit = 0
        var i = 0
        while(i < prices.size) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            i++
        }
        return maxProfit;
    }
}