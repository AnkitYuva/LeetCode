class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        Map<Character,String> map = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = words[i];
            if(map.containsKey(ch)){
                if(map.get(ch).equals(word)){
                    continue;
                }else{
                    return false;
                }
            }
            if(map.containsValue(word)){
                return false;
            }
            map.put(ch,word);
        }
        return true;
    }
}