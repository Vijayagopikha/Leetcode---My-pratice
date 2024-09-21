class Solution {
    public boolean isSameAfterReversals(int num) {
       /* int n=num;
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
        return false;*/

        
        int n=num,ans=0;
        while(n!=0)
        {
            ans=(ans*10)+n%10;
            n=n/10;
        } 
        String s1=Integer.toString(num);
        String s2=Integer.toString(ans);
        if(s1.length()==s2.length())  return true;
        return false;

    }
}