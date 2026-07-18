class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;
        for(int i=0;i<piles.length;i++) {
            if(max < piles[i]) {
                max = piles[i];
            }
        }

        int left = 1;
        int right = max;
        int rate = max;

        while(left <= right) {
            int mid = (left + right) / 2;

            int totalHours = 0;
            for(int i=0;i<piles.length;i++) {
                totalHours += (int) Math.ceil((piles[i] * 1.0) / mid);
            }
            
            if(totalHours <= h) {
                if(rate > mid) {
                    rate = mid;
                }
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return rate;
    }

}
