int missingNumber(int* a, int n) {
    for(int i=0;i<n+1;i++){
        int flag =1;
        for(int j=0;j<n;j++){
            if(a[j] == i){
                flag = 0;
                break;
            }
        }
        if(flag==1) return i;
    }
    return 0;
    }
