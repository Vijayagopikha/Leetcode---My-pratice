class Solution {
    public int minLength(String s) {
        //int n = s.length();
        int i = 0;
       while(i<s.length()-1){
           
             if(((s.charAt(i) == 'A') && (s.charAt(i+1) == 'B'))|| ((s.charAt(i) == 'C') && (s.charAt(i+1) == 'D'))){
               s = s.substring(0,i) + s.substring(i+2);
               i = 0;
             }
             else{
                i++;
             }
           
        }
        return s.length();
    }
}