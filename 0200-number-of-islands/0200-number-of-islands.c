void dfs(int i, int j, char** grid, int n, int m){
    if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1'){
        return;
    }
    grid[i][j] = '0';
    dfs(i-1, j, grid, n, m);
    dfs(i, j+1, grid, n, m);
    dfs(i+1, j, grid, n, m);
    dfs(i, j-1, grid, n, m);
}
int numIslands(char** grid, int gridSize, int* gridColSize) {
    int count = 0;
    int n = gridSize;
    int m = gridColSize[0];
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            if(grid[i][j] == '1'){
                count++;
                dfs(i, j, grid, n, m);
            }
        }
    }
    return count;
}