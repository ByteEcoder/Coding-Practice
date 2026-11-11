class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if((long)cost1+cost2<=costBoth)
        {
            return (long)cost1*need1+(long)cost2*need2;

        }

        if(need1<=need2)
        {
            long res=(long)costBoth*need1;
            need2-=need1;
            return res+(long)need2*Math.min(cost2,costBoth);
        }

        else if(need1>need2)
        {
            long res=(long)costBoth*need2;
            need1-=need2;
            return res+(long)need1*Math.min(cost1,costBoth);
        }
        return 0;
    }
}