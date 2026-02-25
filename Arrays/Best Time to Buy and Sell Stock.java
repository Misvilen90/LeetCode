class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = 0;
        for(int i:prices){
            buy = Math.min(i , buy);
            sell = Math.max(sell,i-buy);
        }
        return sell;
    }
}
