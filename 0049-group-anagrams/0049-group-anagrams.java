class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> map = new HashMap<>();
        for(String str : strs){
            char[] count = new char[26];
            for(char ch : str.toCharArray()){
                count[ch - 'a']++;
            }
            String key = new String(count);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }
}