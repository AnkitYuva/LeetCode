// Greedy Approach
class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int l = 0;
        int r = 0;
        while(r < nums.length-1){
            int dist = 0;
            for(int i = l; i <= r; i++){
                dist = Math.max(dist,i + nums[i]);
            }
            l = r + 1;
            r = dist;
            jump++;
        }
        return jump;
    }
}

// Dynamic Programming
// class Solution {
//     public int jump(int[] nums) {
//         Dynamic Programming 
//         int n = nums.length;
//         int[] dp = new int[n];
//         Arrays.fill(dp,Integer.MAX_VALUE);
//         dp[0] = 0;
//         for(int i = 0; i < n; i++){
//             for(int j = 1; j <= nums[i] && i + j < n; j++){
//                 dp[i+j] = Math.min(dp[i+j],dp[i] + 1);
//             }
//         }
//         return dp[n-1];
//     }
// }