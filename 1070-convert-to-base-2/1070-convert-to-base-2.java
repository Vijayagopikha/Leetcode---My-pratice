class Solution {
    public String baseNeg2(int num) {
        if(num==0) return "0";
        StringBuilder s = new StringBuilder();
        int remain = 0;
        while(num!=0){
            remain = num%-2;
            num/=-2;
            if(remain<0){
                remain+=2;
                num+=1;
            }
            s.append(remain);
        }
        return s.reverse().toString();
    }
}