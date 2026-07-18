class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0 || s.length() == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int index=1;index < s.length();index++) {
            Character ch = s.charAt(index);
            if(ch == ')' || ch == '}' || ch == ']') {
                if(stack.isEmpty()) {
                    return false;
                } else {
                    Character topChar = stack.pop();
                    if(!((topChar == '(' && ch == ')') || (topChar == '{' && ch == '}') || 
                        (topChar == '[' && ch == ']'))) {
                        return false;
                    }
                }
            } else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }
}
