bool isHappy(int n) {
    int i=0;
    while(i++<n){
        int sum = 0;
        while(n!=0){
            int num = n%10;
            sum+=num*num;
            n/=10;
        }
        if(sum==1){
            return true;
           
        }
         n = sum;
      
    }
    return false;
}