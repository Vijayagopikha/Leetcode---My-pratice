class Solution {
    public List<Integer> lexicalOrder(int n) {
       List<Integer>  res = new ArrayList<>();
       for(int i = 1;i<=9;i++){
        dfs(i,n,res);
       }
       return res;
    }
    public void dfs(int cur , int n, List<Integer>res){
        if(cur >n)
         return;
        res.add(cur);
        for(int i=0;i<=9;i++){
            int next = cur*10 + i;
            if(next>n) break;
            dfs(next, n, res);
        }
    }
}