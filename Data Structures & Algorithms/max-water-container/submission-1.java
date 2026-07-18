class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right) {
            int curH = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, (right - left) * curH);

            while(left < right && height[left] <= curH) {
                left++;
            }
            while(left < right && height[right] <= curH) {
                right--;
            }
        }

        return maxArea;
    }
}