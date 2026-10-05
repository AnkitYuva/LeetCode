int scoreOfParentheses(char* s) {
    int total = 0;
    int depth = 0;
    for(int i = 0; s[i] != '\0'; i++){
        if(s[i] == '('){
            depth++;
        }else{
            depth--;
            if(s[i-1] == '('){
                total += pow(2,depth);
            }
        }
    }
    return total;
}