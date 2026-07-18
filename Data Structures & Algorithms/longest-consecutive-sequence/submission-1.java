class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for(int num: nums) {
            numSet.add(num);
        }

        int maxSeq = 0;
        for(int num: nums) {
            if(numSet.contains(num-1)) {
                continue;
            }

            int length = 1;
            while(numSet.contains(num + length)) {
                length++;
            }

            maxSeq = Math.max(length, maxSeq);
        }

        return maxSeq;
    }
}
