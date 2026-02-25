class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy,sell = prices[0],0
        for i in prices:
            buy = min(i,buy)
            sell = max(sell,i-buy)
        return sell
