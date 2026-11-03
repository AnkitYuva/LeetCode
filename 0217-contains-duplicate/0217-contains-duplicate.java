class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i = 0; i < nums.length-1; i++){
        //     if(nums[i]==nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;
        
        HashSet<Integer> hash = new HashSet<>();
        for(int i : nums){
            if(!hash.add(i)){
                return true;
            }
        }
        return false;
    }
}