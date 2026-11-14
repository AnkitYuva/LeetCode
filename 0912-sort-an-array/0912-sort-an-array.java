//Counting sort
class Solution {
    public int[] sortArray(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        if(max == min) return nums;
        int[] count = new int[max - min + 1];
        for(int num : nums){
            count[num - min]++;
        }
        int idx = 0;
        for(int i = 0; i < count.length; i++){
            int copies = count[i];
            int value = i + min;
            while(copies > 0){
                nums[idx++] = value;
                copies--;
            }
        }
        return nums;
    }
}


// Merge Sort
// class Solution {
//     public int[] sortArray(int[] nums) {
//         int left = 0;
//         int right = nums.length-1;
//         divide(nums,left,right);
//         return nums;
//     }
//     public void divide(int[] nums,int left,int right){
//         if(left<right){
//             int mid = left + (right-left)/2;
//             divide(nums,left,mid);
//             divide(nums,mid+1,right);
//             merge(nums,left,mid,right);
//         }
//     }  
//     public void merge(int[] nums,int left,int mid,int right){
//         int n1 = mid - left + 1;
//         int n2 = right - mid;
//         int[] leftarray = new int[n1];
//         int[] rightarray = new int[n2];
//         System.arraycopy(nums,left,leftarray,0,n1);
//         System.arraycopy(nums,mid+1,rightarray,0,n2);
//         int i =0;
//         int j = 0;
//         int k = left;
//         while(i < n1 && j < n2){
//             if(leftarray[i]<rightarray[j]){
//                 nums[k]=leftarray[i++];
//             }else{
//                 nums[k]=rightarray[j++];
//             }
//             k++;
//         }
//         while(i < n1){
//             nums[k++]=leftarray[i++];
//         }
//         while(j < n2){
//             nums[k++]=rightarray[j++];
//         }
//     }
// }