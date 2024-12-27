int maxSubArray(int* no, int n) {
    /*int k=0,max=no[0];

    for(int i=0;i<n-1;i++){
       
        int add=no[i];
       
        for(int j=i+1;j<n;j++){
             add+=no[j];
             if(add < no[j]){
                add = no[j];
             }
             max = fmax(max,add);
        }
       
    }
   
    return max;*/
    int max = no[0];
    int cur = no[0];
    for(int i=1;i<n;i++){
        if(cur < 0) cur = 0;
        cur = cur + no[i];
        if(max <cur){
            max = cur;
        }
    }
    return max;
}
