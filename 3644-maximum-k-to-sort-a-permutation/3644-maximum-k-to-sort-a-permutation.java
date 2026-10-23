class Solution {
    public int sortPermutation(int[] nums) {
        int k = -1;
        boolean flag = true;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                flag = false;
                if(k == -1){
                    k = nums[i];
                }else{
                    k &= nums[i];
                }
            }
        }
        return flag ? 0 : k;
    }
}