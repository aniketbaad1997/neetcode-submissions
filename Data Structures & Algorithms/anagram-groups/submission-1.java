class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupAnagramsMap = new HashMap<>();

        for(int i=0;i<strs.length;i++) {
            String freqString = getFreqString(strs[i]);
            if(!groupAnagramsMap.containsKey(freqString)) {
                groupAnagramsMap.put(freqString, new ArrayList<>());
            }
            groupAnagramsMap.get(freqString).add(strs[i]);
        }

        List<List<String>> groupAnagrams = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry: groupAnagramsMap.entrySet()) {
            groupAnagrams.add(entry.getValue());
        }

        return groupAnagrams;
    }

    private String getFreqString(String str) {
        int[] alpha = new int[26];
        for(int i=0;i<str.length();i++) {
            alpha[((int)str.charAt(i)) - 97] += 1;
        }
        String freqStr = "";
        for(int i=0;i<26;i++) {
            if(alpha[i] != 0) {
                String alphabet = "" + (char) (97+i);
                freqStr += "" + alphabet + alpha[i];
            }
        }
        return freqStr;
    }
}
