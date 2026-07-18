class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for(int num: nums) {
            numsMap.put(num, 0);
        }

        int maxSeq = 0;
        for(Map.Entry<Integer, Integer> entry: numsMap.entrySet()) {
            int res = 0;
            int temp = entry.getKey();
            while(null != numsMap.get(temp) && numsMap.get(temp) == 0) {
                numsMap.put(temp++, -1);
                res++;
            }
            temp = entry.getKey()-1;
            while(null != numsMap.get(temp) && numsMap.get(temp) == 0) {
                numsMap.put(temp--, -1);
                res++;
            }

            if(res > maxSeq) {
                maxSeq = res;
            }
        }

        return maxSeq;
    }
}
