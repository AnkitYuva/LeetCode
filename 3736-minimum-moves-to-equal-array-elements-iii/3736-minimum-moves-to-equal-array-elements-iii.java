class Solution {
    public int minMoves(int[] nums) {
        // int max = nums[0];
        // for(int num : nums){
        //     if(num > max){
        //         max = num;
        //     }
        // }
        // int count = 0;
        // for(int num : nums){
        //     count += max - num;
        // }
        // return count;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : nums){
            if(num > max){
                max = num;
            }
            sum += num;
        }
        return nums.length * max - sum;
    }
}