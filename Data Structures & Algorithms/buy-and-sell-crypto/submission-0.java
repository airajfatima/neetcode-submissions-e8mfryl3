class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int[] suffixMax = new int[prices.length];
        suffixMax[prices.length - 1] = prices[prices.length - 1];
        for(int i = prices.length - 2; i >= 0; i--){
            suffixMax[i] = Math.max(suffixMax[i + 1], prices[i]);
        }
        for(int i = 0; i < prices.length - 1; i++){
            profit = Math.max(profit, suffixMax[i+ 1] -prices[i]);
        }
        return profit;
    }
}
