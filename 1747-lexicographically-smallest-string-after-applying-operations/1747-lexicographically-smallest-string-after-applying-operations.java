class Solution {
    public String findLexSmallestString(String str, int a, int b) {
        Set<String> s = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        String res = str;
        q.offer(str);
        s.add(str);
        while(!q.isEmpty()){
            String cur = q.poll();
            if(cur.compareTo(res) < 0){
                res = cur;
            }

            char[] arr = cur.toCharArray();
            //addition
            for(int i = 1;i<arr.length;i=i+2){
                  arr[i] = (char) (((arr[i] - '0' + a) %10) + '0');
            }
            String w = new String(arr);
            if(s.add(w)){
                q.offer(w);
            }

            //rot
            String rot = cur.substring(cur.length() - b) +cur.substring(0,cur.length()  - b);
            if(s.add(rot)){
                q.offer(rot);
            }
        }
        return res;
    }
}