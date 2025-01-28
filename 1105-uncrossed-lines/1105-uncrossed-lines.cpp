class Solution {
public:
    int solve(int i, int j,int m, int n, vector<int>&nums1, vector<int>&nums2, vector<vector<int>> &dp){
        if(i>=m || j>=n)
           return 0;
        if(dp[i][j] != -1)
           return dp[i][j];
        if(nums1[i]==nums2[j])
           return dp[i][j] = 1 + solve(i+1, j+1, m, n, nums1, nums2,dp);
        
        else
           dp[i][j] = max(solve(i,j+1,m,n,nums1,nums2,dp),solve(i+1,j,m,n,nums1,nums2,dp));
        return dp[i][j];
    }
    int maxUncrossedLines(vector<int>& nums1, vector<int>& nums2) {
        int n1 = nums1.size();
        int n2 = nums2.size();
        vector<vector<int>> dp(n1, vector<int>(n2,-1));
        return solve(0,0,n1,n2,nums1,nums2,dp);
    }
};