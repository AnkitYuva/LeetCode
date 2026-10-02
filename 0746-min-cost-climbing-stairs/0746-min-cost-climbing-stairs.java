class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 1){
            return cost[0];
        }
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2; i < cost.length; i++){
            int jump1 = dp[i-1];
            int jump2 = dp[i-2];
            dp[i] = cost[i] + Math.min(jump1, jump2);
        }
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
}