bool isValid(char* s) {
    char stk[10000];
    int top = -1;
    int i = 0;
    while(s[i]!='\0'){
        if(s[i]=='('){
            stk[++top]=')';
        } else if(s[i]=='{'){
            stk[++top]='}';
        } else if(s[i]=='['){
            stk[++top]=']';
        } else {
        if(top == -1 || stk[top]!=s[i]){
            return false;
        }
        top--;
    }
        i++;
    }
    if(top == -1) {
        return true;
    } else {
        return false;
    }
}