class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(nums,result,0);
        return result;
    }
    public void helper(int[] nums,List<List<Integer>> result,int idx){
        if(idx == nums.length){
            List<Integer> perm = new ArrayList<>();
            for(int num : nums){
                perm.add(num);
            }
            result.add(perm);
            return;
        }
        for(int i = idx; i < nums.length; i++){
            swap(nums,i,idx);
            helper(nums,result,idx+1);
            swap(nums,i,idx);
        }
    }
    public void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}