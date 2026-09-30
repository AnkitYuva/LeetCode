class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[128];
        for(int i = 0; i < t.length(); i++){
            count[t.charAt(i)]++;
            if (i < s.length()) {
                count[s.charAt(i)]--;
            }
        }
        for(int i = 0; i < t.length(); i++){
            if(count[t.charAt(i)]==1){
                return t.charAt(i);
            }
        }
        return ' ';
    }
}