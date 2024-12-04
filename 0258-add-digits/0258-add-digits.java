class Solution {
    public int addDigits(int num) {
        int b=0;
        //,sum=0,k=0,add=0;
        //int no=num;
        while(num>9)
        {
            int add=0;
            while(num!=0)
            {
                b=num%10;
                add+=b;
                num/=10;
            }
            num=add;
        }
        return num;


    }
}