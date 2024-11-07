/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
 //104/223
/*int* nextGreaterElements(int* a, int n, int* rs) {
    *rs = n;
    int ans=-1;
    int *res = (int *)malloc(sizeof(int)*n);

   for(int i=0;i<n-1;i++){    
       
        int f = 0;
        res[i] = -1;
         if(a[n-1]<a[i]){
            ans = a[i];
            
        }
        for(int j=i+1;j<n;j++){
            if(a[i]<a[j]){
                res[i] = a[j];
                break;
            }
            
        }
    }
    res[n-1]=ans;
    
    return res;
}*/
int* nextGreaterElements(int* a, int n, int* rs) {
     *rs = n;
     int *res = (int *)malloc(sizeof(int)*n);
     int k;
     for(int i=0;i<n;i++){
        k = 0;
        res[i] = -1;
        for(int j=i+1;k<n;j++,k++){
            if(a[i]<a[j%n]){
                res[i] = a[j%n];
                break;
            }
        }
     }
     return res;
}