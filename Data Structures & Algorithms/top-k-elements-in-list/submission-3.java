class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num: nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        Map<Integer, List<Integer>> freqReverse = new HashMap<>();
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()) {
            freqReverse.putIfAbsent(entry.getValue(), new ArrayList<>());
            freqReverse.get(entry.getValue()).add(entry.getKey());
        }

        PriorityQueue<Integer> freqHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(Map.Entry<Integer, List<Integer>> entry: freqReverse.entrySet()) {
            freqHeap.add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        while(index < k) {
            int freqNum = freqHeap.poll();
            for(int num: freqReverse.get(freqNum)) {
                res[index++] = num;
                if(index == k) {
                    return res;   
                }
            }
        }
        return res;
    }
}
