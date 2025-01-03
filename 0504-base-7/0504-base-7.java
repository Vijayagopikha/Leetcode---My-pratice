class Solution {
    public String convertToBase7(int num) {
        StringBuilder s = new StringBuilder();
        int[] a=new int[100];
        int k = 0;
        if(num<7 && num>-7) return Integer.toString(num);
        if(num==7) return Integer.toString(10);
        if(num==-7) return Integer.toString(-10);
        if(num<0){
            num = Math.abs(num);
            s.append('-');
        }
        while(num!=0){
           a[k++] = num%7;
           num/=7;
        }

        for(int i=k-1;i>=0;i--){
            s.append(a[i]);
        }
        return s.toString(); 
       /* if(num<7 && num>-7) return Integer.toString(num);
        if(num==7) return Integer.toString(10);
        if(num==-7) return Integer.toString(-10);
        int sum = 0;
        if(num<0){
            num = Math.abs(num);
            while(num!=0){
            sum += (num%7)*10;
           num/=7;
        }
        return Integer.toString(-1*sum);
        }
        else{
           
            while(num!=0){
            sum += (num%7)*10;
           num/=7;
        }
        return Integer.toString(sum);
        }*/

    }
}