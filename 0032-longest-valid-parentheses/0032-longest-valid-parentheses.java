class Solution {
    public int longestValidParentheses(String s) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(-1);
        // int ans = 0;
        // for(int i = 0; i < s.length(); i++){
        //     if(s.charAt(i) == '('){
        //         stack.push(i);
        //     }else{
        //         stack.pop();
        //         if(stack.isEmpty()){
        //             stack.push(i);
        //         }else{
        //             ans = Math.max(ans,i-stack.peek());
        //         }
        //     }
        // }
        // return ans;

        int ans = 0;
        int[] stack = new int[s.length()+1];
        int top = 0;
        stack[0] = -1;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack[++top] = i;
            }else{
                top--;
                if(top < 0){
                    stack[++top] = i;
                }else{
                    ans = Math.max(ans,i-stack[top]);
                }
            }
        }
        return ans;
    }
}
