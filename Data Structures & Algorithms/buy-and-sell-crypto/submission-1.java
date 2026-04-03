class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int suffixMax = prices[prices.length - 1];
        for(int i = prices.length - 2; i >= 0; i--){
            profit = Math.max(profit, suffixMax - prices[i]);
            suffixMax = Math.max(suffixMax, prices[i]);
        }
        return profit;
    }
}
