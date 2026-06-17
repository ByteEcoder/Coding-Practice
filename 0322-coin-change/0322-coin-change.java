class Solution {
    int INF=(int) 1e9;
    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int[coins.length][amount+1];
        for(int r[]:dp)
        {
            Arrays.fill(r,-1);
        }
        int res=mincoin(0,coins,amount,dp);
        if(res!=INF)
            return res;
        return -1;
    }
    public int mincoin(int i,int[] coins, int a,int[][] dp)
    {
        if(a==0)
            return 0;
        if(i==coins.length||a<0)
            return INF;
        if(dp[i][a]!=-1)
            return dp[i][a];
        int pick=1+mincoin(i,coins,a-coins[i],dp);
        int not=mincoin(i+1,coins,a,dp);

        
        return dp[i][a]= Math.min(pick,not);
    }
}