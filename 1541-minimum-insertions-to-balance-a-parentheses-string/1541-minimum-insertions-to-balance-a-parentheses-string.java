class Solution {
    public int minInsertions(String s) {
        int ans = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                count++;
            }else{
                if(i + 1 < s.length() && s.charAt(i+1) == ')'){
                    i++;
                }else{
                    ans++;
                }
                if(count > 0){
                    count--;
                }else{
                    ans++;
                }
            }
        }
        return ans + (count * 2);
    }
}