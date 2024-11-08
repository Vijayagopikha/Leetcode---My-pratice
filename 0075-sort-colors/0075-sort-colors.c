void sortColors(int* a, int n) {
    int zc = 0, oc = 0;
    for(int i=0;i<n;i++){
        if(a[i] == 0){
            zc++;
        }
        if(a[i] == 1){
            oc++;
        }
    }
   
        for(int j=0;j<zc;j++){
            a[j] = 0;
            

        }
        for(int k=zc;k<(zc+oc);k++){
            a[k] = 1;
            
        }
        for(int i = (zc+oc);i<n;i++){
            a[i] = 2;
        }
    
}