int reverse(int x){
    long int rev =0;
        while(x!=0){
           int b=x%10; 
             x/=10;
        
    if(rev<INT_MIN/10 || rev>INT_MAX/10){
        return  0;
    }
    else
       rev = rev *10 + b;
        }
        return rev;
}