class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n =  matrix[0].length;
        int ri = m-1;
        int ci = 0;
        while( ci < n && ri >=0){
            if(matrix[ri][ci] == target){
                return true;
            }
            else  if(matrix[ri][ci] > target){
                ri--;
            }
            else{
                ci++;
            }
        }
        return false;
    }
}