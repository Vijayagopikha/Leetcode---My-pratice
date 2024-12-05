class Solution {
    public String toHex(int num) {
        
        if(num==0)
        return "0";
       int r,m;
       char[]h={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        String st="";
        if(num>0){
        while(num!=0)
        {
            m=num%16;
            st=h[m]+st;
            num/=16;
        }
        }
        else
        {
            int count = 0;
        while (count < 8 && num != 0) {
            st=h[num & 15]+st;
            num = num >> 4;
            count++;
        }
 
        }
        return st;
    }
}
    