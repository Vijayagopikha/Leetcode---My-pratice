class Solution {
    public String convertToBase7(int num) {
        StringBuilder s = new StringBuilder();
        int[] a=new int[100];
        int k = 0;
        if(num==0){
            s.append('0');
            return s.toString();
        }
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
    }
}