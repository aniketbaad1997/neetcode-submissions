class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length+1];
        int[] right = new int[nums.length+1];

        for(int i=0;i<nums.length+1;i++) {
            left[i] = 1;
            right[i] = 1;
        }

        for(int i=1;i<left.length;i++) {
            left[i] = nums[i-1] * left[i-1];
            System.out.println(left[i]);
        }

        System.out.println("#####");
        for(int i=right.length-2;i>=0;i--) {
            right[i] = nums[i] * right[i+1];
            System.out.println(right[i]);
        }

        int[] productExcept = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            productExcept[i] = left[i] * right[i+1];
        }

        return productExcept;
    }
}  
