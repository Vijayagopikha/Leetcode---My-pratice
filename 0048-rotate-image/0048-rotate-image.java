class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int top = 0;
        int bottom  = n-1;
        while(top<bottom){
            for(int col = 0;col<n;col++){
                int temp =  matrix[top][col];
                matrix[top][col] = matrix[bottom][col];
                matrix[bottom][col] = temp;
            }
            top++;
            bottom--;
        }

        for(int r=0;r<n;r++){
            for(int c=r+1;c<n;c++){
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] =temp;
            }
        }
    }
}