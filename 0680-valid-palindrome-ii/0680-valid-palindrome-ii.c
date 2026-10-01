bool isPal(char* s,int left,int right){
    while(left < right){
        if(s[left++] != s[right--]){
            return false;
        }
    }
    return true;
}
bool validPalindrome(char* s) {
    int n = strlen(s);
    int left = 0;
    int right = n - 1;
    while(left < right){
        if(s[left] == s[right]){
            left++;
            right--;
        }else{
            return isPal(s,left+1,right) || isPal(s,left,right-1);
        }
    }
    return true;
}