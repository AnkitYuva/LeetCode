class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        int count = 0;
        int mid = (low + high) >>> 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[mid]){
                count += Math.abs(nums[mid] - nums[i]);
            }
        }
        return count;
    }
}