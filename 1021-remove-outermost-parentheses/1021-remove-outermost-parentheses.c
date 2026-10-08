char* removeOuterParentheses(char* s) {
    char stack[10000];
    int top = -1;
    char* str = (char*)malloc((strlen(s) + 1) * sizeof(char));
    int idx = 0;
    for(int i = 0; s[i] != '\0'; i++){
        if(s[i] == ')'){
            stack[top--];
        }
        if(top != -1){
            str[idx++] = s[i];
        }
        if(s[i] == '('){
            stack[++top] = s[i];
        }
    }
    str[idx] = '\0';

    return str;
}