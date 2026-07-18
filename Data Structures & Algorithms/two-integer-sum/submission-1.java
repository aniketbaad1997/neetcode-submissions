class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> index = new HashMap<>();

        int[] twoSum = new int[2];
        for(int i=0;i<nums.length;i++) {
            if(index.containsKey(target - nums[i])) {
                twoSum[0] = index.get(target - nums[i]);
                twoSum[1] = i;
                break;
            }
            index.put(nums[i], i);
        }

        return twoSum;
    }
}
