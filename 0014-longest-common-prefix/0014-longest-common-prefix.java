class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String p = strs[0];
        for(int i=1;i<n;i++){
            while(strs[i].indexOf(p) != 0){
                p = p.substring(0,p.length()-1);

                if(p.isEmpty()){
                    return "";
                }
            }
        }
        return p;
    }
}