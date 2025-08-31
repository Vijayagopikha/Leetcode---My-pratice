class Solution {
    public int money(int i, int n, int nums[], int dp[]){
        if(i>=n)return 0;
        if(i == n-1)return nums[n-1];
        if(dp[i]!=-1)return dp[i];

        int pick = nums[i] + money(i+2,n,nums,dp);
        int not = 0 + money(i+1,n,nums,dp);

        return dp[i] = Math.max(pick, not);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);

        return money(0,n,nums,dp);
    }
}