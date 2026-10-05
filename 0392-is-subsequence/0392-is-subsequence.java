class Solution {
    public boolean isSubsequence(String s, String t) {
        // int i = 0;
        // int j = 0;
        // while(i < s.length() && j < t.length()){
        //     if(s.charAt(i) == t.charAt(j)){
        //         i++;
        //         j++;
        //     }else{
        //         j++;
        //     }
        // }
        // return i == s.length();

        int index = -1;
        for(char ch : s.toCharArray()){
            index = t.indexOf(ch,index + 1);
            if(index == -1){
                return false;
            }
        }
        return true;
    }
}