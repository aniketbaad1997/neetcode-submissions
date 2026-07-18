class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()) {
            return 0;
        }

        if(s.length() == 1) {
            return 1;
        }

        int i = 0;
        String subString = "";
        int max = 0;
        for(;i < s.length();i++) {
            Character ch = s.charAt(i); 
            if(subString.indexOf(ch) == -1) {
                subString += s.charAt(i);
            } else {
                if(max == 0) {
                    max = subString.length();
                } else {
                    if (max < subString.length()) {
                        max = subString.length();
                    }
                }
                subString = subString.substring(subString.indexOf(ch)+1, subString.length()) + ch;
            }
        }

        return max > subString.length() ? max : subString.length();
    }
}
