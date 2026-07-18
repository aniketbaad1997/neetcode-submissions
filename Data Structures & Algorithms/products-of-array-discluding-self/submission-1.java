class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] right = new int[nums.length];

        right[nums.length - 1] = 1;
        for(int i=right.length-2;i>=0;i--) {
            right[i] = nums[i+1] * right[i+1];
        }

        int left = 1;
        int[] productExcept = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            productExcept[i] = left * right[i];
            left *= nums[i];
        }

        return productExcept;
    }
}  
