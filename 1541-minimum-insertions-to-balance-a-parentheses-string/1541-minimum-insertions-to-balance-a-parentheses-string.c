int minInsertions(char* s) {
    int ans = 0;
    int count = 0;
    for(int i = 0; s[i] != '\0'; i++){
        if(s[i] == '('){
            count++;
        }else{
            if(i + 1 < strlen(s) && s[i+1] == ')'){
                i++;
            }else{
                ans++;
            }
            if(count > 0){
                count--;
            }else{
                ans++;
            }
        }
    }
    return ans + (count * 2);
}