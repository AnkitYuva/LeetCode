class Solution {
    public String reverseOnlyLetters(String s) {
        int[] arr = new int[s.length()];
        String str = s.replaceAll("[^a-zA-Z]","");
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
        String rr = "";
        for(int i = str.length()-1; i>= 0; i--){
            rr += str.charAt(i);
        }
        String result = "";
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==0){
                result += rr.charAt(j++);
            }else{
                result += s.charAt(i);
            }
        }
        return result;
    }
}