class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
       for(int a : arr){
        map.put(a, map.getOrDefault(a, 0) +1);
       }
       List<Integer> l = new ArrayList<>();
       for(int val : map.values()){
          l.add(val);
       }
       Collections.sort(l);
       int c = 0;
       for(int i=0;i<l.size();i++){
           if(k>l.get(i)){
              k-=l.get(i);
              l.set(i, 0);
           }
           else{
            l.set(i, l.get(i)-k);
            k = 0;
           }
           if(l.get(i)!=0)c++;
       }
       return c;
    }
}