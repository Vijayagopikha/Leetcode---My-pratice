bool isHappy(int n) {
    /*int i=0;
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
    return false;*/


    //n = 1 la end ahna happy ...not happy means its end with 4 (its fact)

    do{
         int sum = 0;
          while(n!=0){
            int num = n%10;
            sum+=num*num;
            n/=10;
        }
        n=sum;
    }while(n!=1 && n!=4);
    if(n==1){
        return true;
    }
    else{
        return false;
    }
}