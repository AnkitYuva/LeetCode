class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] freq = new boolean[26];
        for(char ch : allowed.toCharArray()){
            freq[ch - 'a'] = true;
        }
        int count = 0;
        for(int i = 0; i < words.length; i++){
            boolean valid = true;
            for(char ch : words[i].toCharArray()){
                if(!freq[ch - 'a']){
                    valid = false;
                    break;
                }
            }
            if(valid){
                count++;
            }
        }
        return count;
    }
}