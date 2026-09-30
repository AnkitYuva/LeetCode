class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(c == s.charAt(i)){
                list.add(i);
            }
        }
        int[] result = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            int min = Integer.MAX_VALUE;
            if(s.charAt(i) == c){
                result[i] = 0;
            }else{
                for(int idx : list){
                    if(Math.max(idx,i) - Math.min(idx,i) >= 0 && Math.max(idx,i) - Math.min(idx,i) < min){
                        min = Math.max(idx,i) - Math.min(idx,i);
                    }
                }
                result[i] = min;
            }
        }
        return result;
    }
}