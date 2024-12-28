class Solution {
    public boolean isAnagram(String s, String t) {
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String s1 = new String(a);
        String t1 = new String(b);
        return s1.equals(t1);
    }
   
}