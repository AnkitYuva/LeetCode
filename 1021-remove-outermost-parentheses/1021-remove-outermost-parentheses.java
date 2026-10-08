class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        String str = "";
        for(char ch : s.toCharArray()){
            if(ch == ')'){
                stack.pop();
            }
            if(!stack.isEmpty()){
                str += ch;
            }
            if(ch == '('){
                stack.push(ch);
            }
        }
        return str;
    }
}