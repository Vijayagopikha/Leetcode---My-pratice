void moveZeroes(int* a, int n) {
    /*for(int i=0;i<n;i++){
        if(a[i]==0){
            for(int j=i+1;j<n;j++){
                if(a[j]!=a[i]){
                    int t = a[i];
                    a[i]=a[j];
                    a[j]=t;
                    break;
                }
            }
        }*/
        int c = 0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                int t = a[i];
                    a[i]=a[c];
                    a[c]=t;
                    c++;
            }
            
        }
    }
    
