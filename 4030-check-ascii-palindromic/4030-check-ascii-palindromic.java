class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            String str = Integer.toBinaryString(ch);
            while(str.length() < 8){
                str = "0" + str;
            }
            sb.append(str);
        }
        String nor = sb.toString();
        String rev = sb.reverse().toString();
        return nor.equals(rev);   
    }
}