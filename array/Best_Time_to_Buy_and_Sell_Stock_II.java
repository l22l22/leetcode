class Solution {
    public int maxProfit(int[] prices) {
        // 이익
        int profit = 0;
        for(int i = 0 ; i < prices.length-1; i++){
            //다음날 오르면
            if(prices[i+1]-prices[i] > 0) {
                //판다.
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;
    }
}
