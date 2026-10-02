class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack("",0,0,n,list);
        return list;
    }
    public void backtrack(String str,int open,int close,int n,List<String> list){
        if(str.length() == 2 * n){
            list.add(str);
            return;
        }
        if(open < n){
            backtrack(str + "(",open+1,close,n,list);
        }
        if(close < open){
            backtrack(str + ")", open, close+1, n, list);
        }
    }
}