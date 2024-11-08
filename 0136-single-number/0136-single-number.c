int singleNumber(int* a, int n) {
    int count = 0;
    for(int i=0;i<n;i++){
        count =0;
        for(int j=0;j<n;j++){
            if(a[i]==a[j]){
               count++;

            }
        }
            if(count ==1){
                return a[i];
            }
        
    }
    return 0;
}