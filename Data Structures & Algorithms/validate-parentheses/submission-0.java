class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Character c;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }else {
                if(!stack.isEmpty()) {
                    c = stack.pop();
                    if((c == '{' && s.charAt(i) == '}') || (c == '[' && s.charAt(i) == ']') || (c == '(' && s.charAt(i) == ')')) {
                        continue;
                    } else {
                        return false;
                    }
                }else {
                    return false;
                }
            }
        }
        if(!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
