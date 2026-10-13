class Solution {
    public int minMovesToMakePalindrome(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int k = right;
            while(k > left && arr[k] != arr[left]){
                k--;
            }
            if(k == left){
                swap(arr,left,left+1);
                count++;
            }else{
                for(int i = k; i < right; i++){
                    swap(arr,i,i+1);
                    count++;
                }
                left++;
                right--;
            }
        }
        return count;
    }
    public void swap(char[] arr,int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}