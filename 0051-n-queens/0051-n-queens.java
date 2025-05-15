class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n ; i++) Arrays.fill(board[i],'.');
        List<List<String>> ans = new ArrayList<>();
        solve(0,ans,board);
        return ans;
    }
    private void solve(int col, List<List<String>> ans, char[][] board){
        if(col==board.length){
            List < String > res = new LinkedList < String > ();
            for (int i = 0; i < board.length; i++) {
                String s = new String(board[i]);
                res.add(s);
            }
            ans.add(res);
            return;
        }
        for(int i=0 ; i<board.length; i++){
            if(validate(i,col,board)){
                board[i][col]='Q';
                solve(col+1,ans,board);
                board[i][col]='.';
            }
        }
    }
    private boolean validate(int row, int col,char[][] board){
        int oldr=row;
        int oldc=col;
        //upper diagonal check
        while(row>=0 && col>=0){
            if(board[row][col]=='Q') return false;
            row--;
            col--;
        }
        //same row check
        row = oldr;
        col = oldc;
        while(col>=0){
            if(board[row][col]=='Q') return false;
            col--;
        }
        //lower diagonal check
        row = oldr;
        col = oldc;
        while(col>=0 && row<board.length){
            if(board[row][col]=='Q') return false;
            row++;
            col--;
        }
        return true;
    }
}