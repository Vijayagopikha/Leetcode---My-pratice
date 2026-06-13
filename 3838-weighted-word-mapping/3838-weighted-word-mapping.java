class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            int l = word.length();
            int sum = 0;
            for(int i=0;i<l;i++){
                char c = word.charAt(i);
                sum += weights[c-'a'];
                
            }
            int mod = sum%26;
           
            char ch = (char)('z' - mod);
            
            sb.append(ch);
        }
        return sb.toString();
    }
}