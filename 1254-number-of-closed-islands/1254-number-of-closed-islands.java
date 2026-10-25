class Solution {
    public int closedIsland(int[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 || j == 0 || i == n - 1 || j == m - 1){
                    if(grid[i][j] == 0){
                        dfs(i,j,grid,n,m);
                    }
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 0){
                    count++;
                    dfs(i,j,grid,n,m);
                }
            }
        }
        return count;
    }
    public void dfs(int i, int j, int[][] grid, int n, int m){
        if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != 0){
            return;
        }
        grid[i][j] = 1;
        dfs(i-1, j, grid, n, m);
        dfs(i, j+1, grid, n, m);
        dfs(i+1, j, grid, n, m);
        dfs(i, j-1, grid, n, m);
    }
}