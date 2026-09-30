class Solution {
    public String replaceDigits(String s) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                str.append(ch);
            }else if(Character.isDigit(ch)){
                str.append((char)(str.charAt(i-1) + Character.getNumericValue(ch)));
            }
        }
        return str.toString();
    }
}