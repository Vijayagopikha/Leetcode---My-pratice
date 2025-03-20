class Solution {
    public List<String> removeAnagrams(String[] words) {
        String prev = "";
        List<String> res = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            char[] ch = words[i].toCharArray();
            Arrays.sort(ch);
            String cur = String.valueOf(ch);
            if(!cur.equals(prev)){
               res.add(words[i]);
               prev = cur;
            }
        }
        return res;
    }
}