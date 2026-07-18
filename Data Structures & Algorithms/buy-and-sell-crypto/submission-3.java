class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0;
        int left = 0;

        while(left < prices.length) {
            int right = left + 1;
            while(right < prices.length && prices[right] > prices[left]) {
                profit = Math.max(profit, prices[right] - prices[left]);
                right++;
            }
            left = right;
        }

        return profit;
    }
}

