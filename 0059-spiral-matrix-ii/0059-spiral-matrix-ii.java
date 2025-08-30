class Solution {
    public int[][] generateMatrix(int n) {
        int [][] res = new int[n][n];
        int rowBegin  = 0;
        int rowEnd = n-1;
        int colBegin = 0;
        int colEnd = n-1;
        
        int j = 1;

        while(rowBegin <= rowEnd && colBegin <= colEnd){
            for(int i=colBegin ; i<=colEnd;i++){
                res[rowBegin][i] = j++;
            }
            rowBegin++;

            for(int i = rowBegin;i<=rowEnd;i++){
                res[i][colEnd] = j++;
            }
            colEnd--;

            if(rowBegin <= rowEnd){
                for(int i = colEnd;i>=colBegin ;i--){
                    res[rowEnd][i] = j++;
                }
                 rowEnd--;
            }
           
        
            if(colBegin <= colEnd){
                for(int i = rowEnd;i>=rowBegin;i--){
                    res[i][colBegin] = j++;
                }
                colBegin++;
            }
        }
        return res;
    }
}