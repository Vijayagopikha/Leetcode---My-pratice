class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      /* Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
      return new ArrayList<>(map.values()); */ //sorting method

      if(strs == null){
        return new ArrayList<>();
      }
      if(strs.length==1){
        List<List<String>> s = new ArrayList<>();
        s.add(Arrays.asList(strs));
        return s;
      }
      Map<String, List<String>> m = new HashMap<>();
      for(String i : strs){
        String freq = frequency(i);
        if(m.containsKey(freq)){
            m.get(freq).add(i);
        }
        else{
            List<String> s= new ArrayList<>();
             s.add(i);
             m.put(freq,s);
        }
       
      }
      return new ArrayList<>(m.values());
    }
    public String frequency(String s){
        int[] a = new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i) - 'a']+=1;
        }
        StringBuilder r = new StringBuilder("");
        char c = 'a';
        for(int i : a){
            r.append(c);
            r.append(i);
            c++;
        }
        return r.toString();
    }
}