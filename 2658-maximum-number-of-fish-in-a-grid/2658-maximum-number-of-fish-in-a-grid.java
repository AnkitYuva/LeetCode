class Solution {
    int sum;
    int max = Integer.MIN_VALUE;
    public int findMaxFish(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sum = 0;
                if(grid[i][j] != 0){
                    dfs(i,j,grid,n,m);
                }
            }
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
    public void dfs(int i, int j, int[][] grid,int n, int m){
        if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0){
            return;
        }
        sum += grid[i][j];
        grid[i][j] = 0;
        dfs(i-1, j, grid, n, m);
        dfs(i, j+1, grid, n, m);
        dfs(i+1, j, grid, n, m);
        dfs(i, j-1, grid, n, m);
        max = Math.max(max,sum);
    }
}