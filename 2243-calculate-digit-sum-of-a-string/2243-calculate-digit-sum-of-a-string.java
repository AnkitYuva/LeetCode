class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k){
            String[] arr = new String[(s.length() + k - 1) / k];
            int idx = 0;
            for(int i = 0; i < s.length(); i+=k){
                if(i + k > s.length()){
                    arr[idx++] = s.substring(i);
                }else{
                    arr[idx++] = s.substring(i,i+k);
                }
            }
            for(int i = 0; i < arr.length; i++){
                int sum = 0;
                for(int j = 0; j < arr[i].length(); j++){
                    sum += arr[i].charAt(j) - '0';
                }
                arr[i] = sum + "";
            }
            String temp = "";
            for(String str : arr){
                temp += str;
            }
            s = temp;
        }
        return s;
    }
}