class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0;
        int r = m*n -1;
        while(l<=r){
            int mid = (l+r)/2;
            int row = mid/n;
            int col = mid%n;
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target)
            {
                r--;
            }
            else{
                l++;
            }
        }
        return false;
    }
}