/*int fib(int n){
   if(n==0 || n == 1)
      return n;
    else
      return fib(n-1) + fib(n-2);
}*/

//for passing tetscase
//int f[31] =  { 0,1,1,2,3,5,...} //based on contrainsts 0<=30


//top-down dp
/*int solve(int n,int *dp)
{
    if(n==0 || n == 1)
      return n;
    if(dp[n]!=-1)
       return dp[n];
    else
      return dp[n] = solve(n-1,dp) + solve(n-2,dp);
}
int fib(int n){
    int dp[31] ;
    memset(dp, -1, sizeof(dp));
    return solve(n,dp);
}*/

//bottom-up
int fib(int n){
    int dp[31];
    memset(dp,-1,sizeof(dp));

   if(n==0 || n == 1)
      return n;

    dp[0] = 0;
    dp[1] = 1;
    for(int i=2;i<=n;i++){
       dp[i] =  dp[i-1] + dp[i-2];
    }
    return dp[n];
}