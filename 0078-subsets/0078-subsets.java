class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        helper(nums,list,0,ans);
        return list;
    }
    public static void helper(int[] nums,List<List<Integer>> list, int i,List<Integer> ans){
        if(i == nums.length){
            list.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        helper(nums,list,i+1,ans);
        ans.remove(ans.size()-1);
        helper(nums,list,i+1,ans);
    }
}