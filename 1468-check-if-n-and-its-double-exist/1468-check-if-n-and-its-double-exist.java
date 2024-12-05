class Solution {
    public boolean checkIfExist(int[] arr) {
        int l = arr.length;
        
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
               if(i!=j){
                if(arr[i] == (2*arr[j])){
                    return true;
                }
                
               }
            }
        }
        return false;
    }
}