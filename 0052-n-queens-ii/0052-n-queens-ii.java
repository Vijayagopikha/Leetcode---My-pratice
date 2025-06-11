class Solution {
    public int solve(int col, int n, char board[][], int left[], int upper[], int lower[]){

        if(col==n){
           return 1;
        }
        int tol = 0;
        for(int r = 0;r<n;r++){
            if(left[r] == 0 && upper[r+col] ==0 && lower[n-1 + col-r] ==0){
                board[r][col] = 'Q';
                left[r] = 1;
                upper[r+col ] = 1;
                lower[n-1 + col-r] = 1;

                tol += solve(col+1, n, board, left, upper, lower);

                board[r][col] = '.';
                left[r] = 0;
                upper[r+col ] = 0;
                lower[n-1 + col-r] = 0;
            }
        }
        return tol;
    }
    public int totalNQueens(int n) {
        
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i], '.');
        }
        int left[] = new int[n];
        int upper[] = new int[2*n-1];
        int lower[] = new int [2*n-1];
        return solve(0, n, board, left, upper, lower);
        
    }
}