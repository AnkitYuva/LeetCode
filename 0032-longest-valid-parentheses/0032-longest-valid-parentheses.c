int longestValidParentheses(char* s) {
    int ans = 0;
    int stack[strlen(s)+1];
    int top = 0;
    stack[0] = -1;
    for(int i = 0; s[i] != '\0'; i++){
        if(s[i] == '('){
            stack[++top] = i;
        }else{
            top--;
            if(top < 0){
                stack[++top] = i;
            }else{
                ans = fmax(ans,i-stack[top]);
            }
        }
    }
    return ans;
}