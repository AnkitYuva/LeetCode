class Solution {
    public int minCost(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Set<Integer>[][] dp = new HashSet[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                dp[i][j] = new HashSet<>();
            }
        }
        dp[0][0].add(grid[0][0]);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                for(int xor : dp[i][j]){
                    if(j + 1 < m){
                        dp[i][j+1].add(xor ^ grid[i][j+1]);
                    }
                    if(i + 1 < n){
                        dp[i+1][j].add(xor ^ grid[i+1][j]);
                    }
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int num : dp[n-1][m-1]){
            ans = Math.min(ans,num);
        }
        return ans;
    }
}