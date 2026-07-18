class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));
            if(height[left] < height[right]) {
                int temp = height[left++];
                while(left < right && height[left] <= temp) {
                    left++;
                }
            } else if(height[left] > height[right]) {
                int temp = height[right--];
                while(left < right && height[right] <= temp) {
                    right--;
                }
            } else {
                int temp = height[left++];
                while(left < right && height[left] <= temp) {
                    left++;
                }
                temp = height[right--];
                while(left < right && height[right] <= temp) {
                    right--;
                }
            }
        }

        return maxArea;
    }
}
