// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) {
//         List<Integer> arr = new ArrayList<>();
//         Arrays.sort(nums);
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i]==target){
//                 arr.add(i);
//             }
//         }
//         return arr;
//     }
// }


class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less = 0;
        int count = 0;
        for(int num : nums){
            if(num < target){
                less++;
            }else if(num == target){
                count++;
            }
        }
        if(count == 0){
            return new ArrayList<>();
        }
        List<Integer> arr = new ArrayList<>(count);
        for(int i = 0; i < count; i++){
            arr.add(less + i);
        }
        return arr;
    }
}