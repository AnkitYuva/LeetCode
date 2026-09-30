class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        int[] arr = new int[26];
        for(int i = 0; i < chars.length(); i++){
            arr[chars.charAt(i) - 'a']++;
        }
        for(String word:words){
            boolean valid = true;
            int[] clo = arr.clone();
            for(int i = 0; i <word.length(); i++){
                if(clo[word.charAt(i) - 'a'] == 0){
                    valid = false;
                }else{
                    clo[word.charAt(i) - 'a']--;
                }
            }
            if(valid){
                sum += word.length();
            }
        }
        return sum;
    }
}