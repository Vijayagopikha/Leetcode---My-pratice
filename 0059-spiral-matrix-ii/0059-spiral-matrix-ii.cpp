/*class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        
        vector<vector<int>>res;
        int rb = 0;
        int re = n-1;
        int cb = 0;
        int ce = n-1;
        int k = 1;
        int arr[n][n];
        while(rb<=re && cb<=ce && k<=n*n){
          
            for(int i = cb;i<=ce;i++){
               arr[rb][i]=k++;
            }
           
            rb++;
            vector<int>v1;
            for(int i = rb;i<=re;i++){
               arr[i][ce]=k++;
            }
            
            ce--;
            if(rb<=re){
              
            for(int i =ce;i>=cb;i--){
               arr[re][i] = k++;
            }
            
            }
            re--;
            if(cb<=ce){
               
            for(int i=re;i>=rb;i--){
               arr[i][cb] =  k++;
            }
           
            }
            cb++;
        }
        for(int i=0;i<n;i++){
            vector<int>v;
            for(int j=0j;<n;j++){
              v.push_back(arr[i][j]);
            }
            res.push_back(v);
        }
        return res;
    }
};*/

class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        vector<vector<int>> res(n, vector<int>(n));
        int rb = 0, re = n - 1, cb = 0, ce = n - 1;
        int k = 1;

        while (rb <= re && cb <= ce) {
            for (int i = cb; i <= ce; ++i) {
                res[rb][i] = k++;
            }
            rb++;
            
            for (int i = rb; i <= re; ++i) {
                res[i][ce] = k++;
            }
            ce--;
            
            if (rb <= re) {
                for (int i = ce; i >= cb; --i) {
                    res[re][i] = k++;
                }
            }
            re--;
            
            if (cb <= ce) {
                for (int i = re; i >= rb; --i) {
                    res[i][cb] = k++;
                }
            }
            cb++;
        }
        
        return res;
    }
};
