class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
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
    public void dfs(int i, int j, char[][] grid, int n, int m){
        if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1'){
            return;
        }
        grid[i][j] = '0';
        dfs(i-1, j, grid, n, m);
        dfs(i, j+1, grid, n, m);
        dfs(i+1, j, grid, n, m);
        dfs(i, j-1, grid, n, m);  
    }
}


// class Solution {
//     public int numIslands(char[][] grid) {
//     if(grid == null || grid.length == 0){
//         return 0;
//     }
//     int n = grid.length;
//     int m = grid[0].length;
//     int count = 0;
//     boolean[][] visited = new boolean[n][m];
//     for(int i = 0; i < n; i++){
//         for(int j = 0; j < m; j++){
//             if(!visited[i][j] && grid[i][j] == '1'){
//                 count++;
//                 dfs(i,j,grid,visited,n,m);
//             }
//         }
//     }
//     return count;
// }
// public void dfs(int i, int j, char[][] grid, boolean[][] visited,int n,int m){
//     if(i < 0 || j < 0 || i >= n || j >= m || visited[i][j] || grid[i][j] != '1'){
//         return;
//     }
//     visited[i][j] = true;
//     dfs(i-1, j, grid, visited,n,m); 
//     dfs(i, j+1, grid, visited,n,m);
//     dfs(i+1, j, grid, visited,n,m);
//     dfs(i, j-1, grid, visited,n,m);      
//     }
// }