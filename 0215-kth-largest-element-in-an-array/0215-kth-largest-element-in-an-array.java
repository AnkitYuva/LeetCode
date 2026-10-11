class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int i = nums.length-1;
        while(i > nums.length-k){
            i--;
        }
        return nums[i];
    }
}