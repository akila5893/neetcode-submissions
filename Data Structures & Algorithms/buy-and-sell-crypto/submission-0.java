class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        for(int i=0;i<prices.length-1;i++) {
            for(int j=i+1;j<prices.length;j++) {
                if(prices[j] - prices[i] > max_profit) {
                    max_profit=prices[j] - prices[i];
                }
            }
        }
        return max_profit;
    }
}
