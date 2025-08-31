class Solution {
    public int money(int i, int n, int nums[], int dp[]){
        if(i>=n)return 0;
        if(i == n-1)return nums[n-1];
        if(dp[i]!=-1)return dp[i];
        int pick = nums[i] + money(i+2,n,nums,dp);
        int not = money(i+1,n,nums,dp);
        return dp[i] = Math.max(pick,not);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        int max1 = money(0,n-1,nums,dp);

        Arrays.fill(dp,-1);
        int max2 = money(1,n,nums,dp);
        return (max1 > max2)? max1:max2;
    }
}