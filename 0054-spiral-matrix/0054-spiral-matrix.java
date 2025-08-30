class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        List<Integer> res = new ArrayList<>();
        int rowBegin = 0;
        int rowEnd = r-1;

        int colBegin = 0;
        int colEnd = c-1;

        while(rowBegin <= rowEnd && colBegin <= colEnd){
            for(int i = colBegin;i<=colEnd ;i++){
                res.add(matrix[rowBegin][i]); 
            }
            rowBegin++;


            for(int i=rowBegin;i<=rowEnd;i++){
                res.add(matrix[i][colEnd]);
            }
            colEnd--;

            if(rowBegin <= rowEnd){

                for(int i=colEnd;i>=colBegin;i--){
                    res.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }
            

            if(colBegin <= colEnd){
                for(int i=rowEnd;i>=rowBegin;i--){
                    res.add(matrix[i][colBegin]);
                }
                colBegin++;
            }
        }
        return res;
    }
}