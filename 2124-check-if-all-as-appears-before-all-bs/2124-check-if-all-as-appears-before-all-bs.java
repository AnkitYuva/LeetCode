class Solution {
    public boolean checkString(String s) {
        int a = s.lastIndexOf('a');
        int b = s.indexOf('b');
        return a == -1 || b == -1 || a < b;
    }
}