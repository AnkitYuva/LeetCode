class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int j = 1; j <= n; j++){
            int min = Integer.MAX_VALUE;
            for(int i = j - 3; i < j; i++){
                if(i >= 0){
                    int cost = dp[i] + costs[j-1] + (int)Math.pow(j-i,2);
                    min = Math.min(min,cost);
                }
            }
            dp[j] = min;
        }
        return dp[n];
    }
}