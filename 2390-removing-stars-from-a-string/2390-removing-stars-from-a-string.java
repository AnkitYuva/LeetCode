class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='*'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        String str = "";
        for(char ch : stack){
            str += ch;
        }
        return str;
    }
}