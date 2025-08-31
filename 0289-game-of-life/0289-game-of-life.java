class Solution {
    public void gameOfLife(int[][] copy) {
        int r = copy.length;
        int c = copy[0].length;


          int[][] matrix = new int[r][c];
        
        // make a copy of the board
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = copy[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                if(matrix[i][j] == 0){
                    int l = 0;
                    if(i+1 < r){
                        if(matrix[i+1][j] == 1) l++;
                    }
                    if(i-1 >=0){
                        if(matrix[i-1][j] == 1)l++;
                    }
                    if(j+1 <c ){
                        if(matrix[i][j+1] == 1) l++;

                    }
                    if(j-1 >=0){
                        if(matrix[i][j-1] ==1 )l++;
                    }
                    if(i+1 <r && j+1 < c){
                        if(matrix[i+1][j+1] ==1)l++;
                    }
                    if(i+1 < r && j-1>=0){
                        if(matrix[i+1][j-1] ==1)l++;
                    }
                    if(i-1 >=0 && j+1<c){
                        if(matrix[i-1][j+1] ==1)l++;
                    }
                    if(i-1 >=0 && j-1 >=0){
                        if(matrix[i-1][j-1] ==1) l++;
                    }

                    if(l==3){
                        copy[i][j] = 1;
                    }
                }
                else{
                     int l = 0;
                    if(i+1 < r){
                        if(matrix[i+1][j] == 1) l++;
                    }
                    if(i-1 >=0){
                        if(matrix[i-1][j] == 1)l++;
                    }
                    if(j+1 <c ){
                        if(matrix[i][j+1] == 1) l++;

                    }
                    if(j-1 >=0){
                        if(matrix[i][j-1] ==1 )l++;
                    }
                    if(i+1 <r && j+1 < c){
                        if(matrix[i+1][j+1] ==1)l++;
                    }
                    if(i+1 < r && j-1>=0){
                        if(matrix[i+1][j-1] ==1)l++;
                    }
                    if(i-1 >=0 && j+1<c){
                        if(matrix[i-1][j+1] ==1)l++;
                    }
                    if(i-1 >=0 && j-1 >=0){
                        if(matrix[i-1][j-1] ==1) l++;
                    }
                    
                    if(l<2)copy[i][j] = 0;
                    if(l>3) copy[i][j]  =0;
                }
            }
        }
    }
}