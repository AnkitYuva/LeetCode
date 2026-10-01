class Solution {
    public boolean isValid(String s) {
        // Stack<Character> stack = new Stack<>();
        //     for(int i = 0; i < s.length(); i++){
        //         if(s.charAt(i)=='('){
        //             stack.push(')');
        //         }else if(s.charAt(i)=='{'){
        //             stack.push('}');
        //         }else if(s.charAt(i)=='['){
        //             stack.push(']');
        //         }else{
        //             if(stack.isEmpty() || stack.peek() != s.charAt(i)){
        //                 return false;
        //             }
        //             stack.pop();
        //         }
        //     }
        //     return stack.isEmpty();

        if (s.length() % 2 != 0) {
            return false;
        }
        char[] stack = new char[s.length()];
        int top = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack[top++] = ')';
            }else if(ch == '{'){
                stack[top++] = '}';
            }else if(ch == '['){
                stack[top++] = ']';
            }else{
                if(top == 0 || stack[--top] != ch){
                    return false;
                }
            }
        }
        return top == 0;
    }
}
