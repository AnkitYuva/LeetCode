class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            set.add(ch);
        }
        int max = 0;
        for(char ch : set){
            int first = s.indexOf(ch);
            int last = s.lastIndexOf(ch);
            max = Math.max(max,last-(first+1));
        }
        if(set.size() == s.length() && max == 0){
            return -1;
        }
        return max;
    }
}