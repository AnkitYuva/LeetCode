class Solution {
    public String reverseVowels(String s) {
        Stack<Character> vov = new Stack();
        for(char ch : s.toCharArray()){
            if(isVovel(ch)){
                vov.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++){
            if(isVovel(s.charAt(i))){
                sb.setCharAt(i,vov.pop());
            }
        }
        return sb.toString();
    }
    public boolean isVovel(char ch){
        switch(Character.toLowerCase(ch)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}