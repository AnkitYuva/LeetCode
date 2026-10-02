class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        return Math.max(helper(nums,0,nums.length-2),helper(nums,1,nums.length-1));
    }
    public int helper(int[] nums,int start,int end) {
        if(nums.length == 1){
            return nums[0];
        }
        int one = nums[start];
        int two = Math.max(nums[start],nums[start+1]);
        int result = two;
        for(int i = start + 2; i <= end; i++){
            result = Math.max(two,one + nums[i]);
            one = two;
            two = result;
        }
        return result;
    }
}