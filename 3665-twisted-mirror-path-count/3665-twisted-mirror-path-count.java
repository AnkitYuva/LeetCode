class Solution {
    public int uniquePaths(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int MOD = 1_000_000_007;
        int[][][] dp = new int[n][m][2];
        dp[0][0][0] = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 && j == 0){
                    continue;
                }
                if(i > 0){
                    if(grid[i-1][j] == 0){
                        dp[i][j][0] = (dp[i-1][j][0] + dp[i-1][j][1]) % MOD;
                    }else{
                        dp[i][j][0] = dp[i-1][j][1];
                    }
                }
                if(j > 0){
                    if(grid[i][j-1] == 0){
                        dp[i][j][1] = (dp[i][j-1][0] + dp[i][j-1][1]) % MOD;
                    }else{
                        dp[i][j][1] = dp[i][j-1][0];
                    }
                }
            }
        }
        return (dp[n-1][m-1][0] + dp[n-1][m-1][1]) % MOD;
    }
}