class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int k = 1; k <= n; k++){
            if(n % k == 0 && check(nums,k)){
                ans += k;
            }
        }
        return ans;
    }
    public boolean check(int[] nums,int k){
        int prev = 0;
        for(int start = 0; start < nums.length; start += k){
            int end = start + k;
            int first = start;
            for(int i = start + 1; i < end; i++){
                if(nums[i] < nums[i-1]){
                    first = i;
                    break;
                }
            }
            int idx = first;
            for(int j = 0; j < k; j++){
                if(nums[idx] < prev){
                    return false;
                }
                prev = nums[idx];
                idx++;
                if(idx == end){
                    idx = start;
                }
            }
        }
        return true;
    }
}