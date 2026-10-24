class Solution {
    public int countSubstrings(String s) {
        int count = s.length();
        for(int i = 0; i < s.length()-1; i++){
            for(int j = i + 1 ; j < s.length(); j++){
                if(isPal(s,i,j)){
                    count++;
                }
            }
        }
        return count;
    }
    public boolean isPal(String s,int left,int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}