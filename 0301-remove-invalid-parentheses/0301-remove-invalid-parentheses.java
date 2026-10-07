class Solution {
    public List<String> removeInvalidParentheses(String s) {
        Set<String> set = new HashSet<>();
        set.add(s);
        while(true){
            List<String> valid = new ArrayList<>();
            for(String str : set){
                if(isValid(str)){
                    valid.add(str);
                }
            }
            if(!valid.isEmpty()){
                return valid;
            }
            Set<String> next = new HashSet<>();
            for(String str : set){
                for(int i = 0; i < str.length(); i++){
                    if(str.charAt(i) == '(' || str.charAt(i) == ')'){
                        next.add(str.substring(0,i) + str.substring(i+1));
                    }
                }
            }
            set = next;
        }
    }
    public boolean isValid(String str){
        int count = 0;
        for(char ch : str.toCharArray()){
            if(ch == '(') count++;
            if(ch == ')') count--;
            if(count < 0) return false;
        }
        return count == 0;
    }
}