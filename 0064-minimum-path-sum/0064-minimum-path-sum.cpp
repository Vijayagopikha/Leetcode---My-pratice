class Solution {
public:
    int solve(int i,int j, int m, int n, vector<vector<int>> &a, vector<vector<int>> &dp){
        if(i>=m || j>=n)
            return INT_MAX;
        if(i==m-1 && j==n-1)
             return a[i][j];
        if(dp[i][j]!=-1)
             return dp[i][j];
        else
           return dp[i][j] = a[i][j]+ min(solve(i+1,j,m,n,a,dp) , solve(i,j+1,m,n,a,dp));
    }
    int minPathSum(vector<vector<int>>& g) {
        int m = g.size();
        int n = g[0].size();
        vector<vector<int>> dp(m, vector<int>(n,-1));
       
        return solve(0,0,m,n,g,dp);
    }
};