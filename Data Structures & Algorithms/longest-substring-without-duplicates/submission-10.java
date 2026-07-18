class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s.length() == 1) {
            return s.length();
        }

        Map<Character, Integer> count = new HashMap<>();
        int longSubStr = 0;
        int left = 0;
        int right = 0;

        while(right < s.length()) {
            Character ch = s.charAt(right);
            if(count.getOrDefault(ch, 0) == 0) {
                count.put(ch, 1);
                right++;
            } else {
                longSubStr = Math.max(longSubStr, right - left);
                System.out.println(s.substring(left, right) + " : " + longSubStr);
                while(left < right) {
                    count.put(s.charAt(left), 0);
                    if(s.charAt(left++) == ch) {   
                        break;
                    }
                }
            }
        }
        System.out.println("R: " + right + "Left: " + left);
        return Math.max(longSubStr, right - left);
    }
}
