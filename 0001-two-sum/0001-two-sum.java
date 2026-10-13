class Solution {
    public int[] twoSum(int[] nums, int target) {
// Optimal Approach Using Map
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(hash.containsKey(temp)){
                return new int[] {hash.get(temp),i};
            }
            hash.put(nums[i],i);
        }
        return new int[] {};
//Brute Force Approach
        // for(int i = 0; i < nums.length-1; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // return new int[] {0,0};
    }
}