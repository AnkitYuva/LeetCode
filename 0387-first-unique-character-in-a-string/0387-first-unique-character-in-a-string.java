class Solution {
    public int firstUniqChar(String s) {
        // for(int i = 0; i < s.length(); i++) {
        //     int flag = 0;
        //     for(int j = 0; j < s.length(); j++) {
        //         if(i != j && s.charAt(i) == s.charAt(j)) {
        //             flag = 1;
        //             break;
        //         }
        //     }
        //     if(flag == 0) {
        //         return i;
        //     }
        // }
        // return -1;
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            if(count[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}