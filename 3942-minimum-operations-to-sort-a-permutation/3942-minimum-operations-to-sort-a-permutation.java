class Solution {
    public int minOperations(int[] nums) {
        int drops = 0;
        int zero = 0;
        int n = nums.length;
        for(int i = 1; i < n; i++){
            if(nums[i-1] > nums[i]){
                drops++;
            }
            if(nums[i] == 0){
                zero = i;
            }
        }
        if(nums[n-1] > nums[0]){
            drops++;
        }
        
        if(drops <= 1){
            return Math.min(zero,n - zero + 2);
        }
        if(drops == n - 1){
            return Math.min(zero + 2,n - zero);
        }
        return -1;
    }
}