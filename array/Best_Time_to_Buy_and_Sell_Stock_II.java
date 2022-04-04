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
    /*
        Max stock amount is only one.
        If I want to get profit, I have to buy one after selling it.
        
        I can do 1. buy 2. sell 3. do nothing.
        
        If price keeps going up, your profit is same with total sum of profits.
        ex) 1, 2, 3, 4, 5 = 5-1 = 2-1 + 3-2 + 4-3 + 5-4
        
        If price is going up and down, I have to sell before price going down.
        This way is alway bigger than (max price - first buying price).
        ex) 1,3,1,5 -> (3-1) + (5-1) > (5-1)
        
        If price keeps falling down I have to do nothing.
        Also, If price doesnt change, I have to do nothing.
        
        So, All profit is same as sum of profit of each days going up prices.
        
        이익의 합은 다음날 값이 오른 경우의 오른 값들의 합과 같다. 
    */
}
