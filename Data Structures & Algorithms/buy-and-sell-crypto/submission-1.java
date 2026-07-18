class Solution {
    public int maxProfit(int[] prices) {
        
        int p=0;
        int left=0;
        int right=1;

        while(left < prices.length) {
            int buy = prices[left];
            while(right < prices.length && prices[right] >= buy) {
                p = Math.max(p, prices[right] - buy);
                right++;
            }
            left = right;
        }

        return p;
    }
}
