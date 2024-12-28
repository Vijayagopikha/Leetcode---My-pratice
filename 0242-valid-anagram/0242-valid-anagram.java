class Solution {
    public boolean isAnagram(String s, String t) {
      /*  char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String s1 = new String(a);
        String t1 = new String(b);
        return s1.equals(t1);*/
        int n = s.length();
        int l = t.length();
        int[] fre = new int[26];
        if(n!=l) return false;
        for(int i=0;i<n;i++){
            fre[s.charAt(i) - 'a'] += 1;
        }
        for(int i=0;i<l;i++){
            if(fre[t.charAt(i) - 'a'] ==0)
            {
                return false;
            }
            fre[t.charAt(i) - 'a']-=1;
        }
        return true;
    }
   
}