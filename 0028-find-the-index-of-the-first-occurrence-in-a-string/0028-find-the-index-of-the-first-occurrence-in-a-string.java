class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty() || haystack.isEmpty()){
            return -1;
        }
        if(needle.length() > haystack.length()){
            return -1;
        }
        int index = haystack.indexOf(needle.charAt(0));
        while(index != -1 && index <= haystack.length()-needle.length()){
            String sub = haystack.substring(index,index+needle.length());
            if(sub.equals(needle)){
                return index;
            }
            index = haystack.indexOf(needle.charAt(0),index+1);
        }
        return -1;
    }
}