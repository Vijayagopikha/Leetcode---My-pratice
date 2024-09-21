class Solution {
    public boolean isSameAfterReversals(int num) {
        int n=num;
        for(int i=0;i<2;i++){
            int rev=0,b=0;
            while(num!=0){
               b = num%10;
               rev = (rev*10)+b;
               num=num/10;
            }
            num=rev;
        }
        if(num==n)
        return true;
        else
        return false;
    }
}