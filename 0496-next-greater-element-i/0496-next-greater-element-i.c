/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* nextGreaterElement(int* n1, int ns1, int* n2, int ns2, int* rs) {
    /*
    *rs = ns1;
    int *res = (int *)malloc(sizeof(int)*ns1);
    int ind = 0, nt = -1,l;
    for(int i=0;i<ns1;i++){
        int found = 0;
        for(int j=0;j<ns2;j++){
            if(n1[i]==n2[j]){
               for(int k=j+1;k<ns2;k++){
                if(n2[k]>n2[j]){
                   found = 1;
                  l=k;
                   break;
                }
               }
               if(found==1){
                res[ind++] = n2[l];
               }
               else{
                res[ind++] = nt;
               }
              
            }
        }
    }
    return res;*/
    //using only  two loops
    *rs = ns1;
    int *res = (int *)malloc(sizeof(int)*ns1);
    for(int i=0;i<ns1;i++){
        int found = 0;
        res[i] = -1;
        for(int j=0;j<ns2;j++){
            if(n1[i]==n2[j]){
                found = 1;
            }
            if(found && n1[i]<n2[j]){
                res[i] = n2[j];
                break;
            }
        }
    }
    return res;
}