class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if(i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            while(left < right) {
                int targetSum = nums[i] + nums[left] + nums[right];
                if(targetSum < 0) {
                    left++;
                } else if(targetSum > 0) {
                    right--;
                } else {
                    triplets.add(new ArrayList<>(Arrays.asList(
                        nums[i],
                        nums[left++],
                        nums[right--]
                    )));
                    
                    while(left < right && nums[left] == nums[left-1]) {
                        left++;
                    }
                    while(left < right && nums[right] == nums[right+1]) {
                        right--;
                    }
                }
            }
        }

        return triplets;
    }
}
