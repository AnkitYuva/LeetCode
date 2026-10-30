class Solution {
    public int countBattleships(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 'X'){
                    count++;
                    dfs(i,j,board,n,m);
                }
            }
        }
        return count;
    }
    public void dfs(int i, int j, char[][] board, int n, int m){
        if(i < 0 || j < 0 || i >= n || j >= m || board[i][j] != 'X'){
            return;
        }
        board[i][j] = '.';
        dfs(i-1,j,board,n,m);
        dfs(i,j+1,board,n,m);
        dfs(i+1,j,board,n,m);
        dfs(i,j-1,board,n,m);
    }
}