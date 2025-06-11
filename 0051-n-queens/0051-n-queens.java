class Solution {
    public void solve(int col, int n, char board[][], int leftRow[], int upperDiagonal[], int lowerDiagonal[], List<List<String>> result){
        if(col == n){
            List<String> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(new String(board[i]));
            }
            result.add(list);
        }
        for(int r =0;r<n;r++){
            if(leftRow[r] == 0 && upperDiagonal[r+col] ==0 && lowerDiagonal[n-1 + col-r] ==0){
                board[r][col] =  'Q';
                leftRow[r] = 1;
                upperDiagonal[r+col] = 1;
                lowerDiagonal[n-1 + col-r] =1;

                solve(col+1, n, board, leftRow, upperDiagonal, lowerDiagonal, result);

                board[r][col] = '.';
                leftRow[r] = 0;
                upperDiagonal[r+col]  = 0;
                lowerDiagonal[n-1 + col-r] =0;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result =  new ArrayList<>();
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i], '.');
        }
        int leftRow[] = new int[n];
        int upperDiagonal[] = new int[2*n-1];
        int lowerDiagonal[] = new int[2*n-1];
        solve(0,n,board,leftRow,upperDiagonal, lowerDiagonal, result);
        return result;
    }
}