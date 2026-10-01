class Solution {
    public int lengthOfLastWord(String s) {
        int i=0,count=0;
        i=s.length()-1;
    while(i>=0 && s.charAt(i)==' '){
        i--;
    }
    while(i>=0 && s.charAt(i)!=' '){
        count++;
        i--;
    }
    return count;
    }
}