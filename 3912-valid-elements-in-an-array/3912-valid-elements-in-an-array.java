class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums.length == 1){
            list.add(nums[0]);
            return list;
        }
        list.add(nums[0]);
        for(int i = 1; i < nums.length - 1; i++){
            if(check(nums,0,i-1,nums[i]) || check(nums,i+1,nums.length-1,nums[i])){
                list.add(nums[i]);
            }
        }
        list.add(nums[nums.length-1]);
        return list;
    }
    public boolean check(int[] nums,int left,int right,int num){
        for(int i = left;i <= right; i++){
            if(nums[i] >= num){
                return false;
            }
        }
        return true;
    }
}