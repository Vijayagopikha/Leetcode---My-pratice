class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        List<int []> res = new ArrayList<>();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j] == 0){
                    res.add(new int[]{i,j});
                }
            }
        }

       for(int pos[] : res){
        int row = pos[0];
        int col = pos[1];

        for(int i=0;i<c;i++){
          matrix[row][i] = 0;
        }

        for(int i=0;i<r;i++){
            matrix[i][col]  =0;
        }
       }
    }
}