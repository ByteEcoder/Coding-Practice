class Solution {
    public int numOfSubarrays(int[] arr) {
        int M=(int)1e9+7;
        int n=arr.length;
        int nodd=0;
        int neven=1;
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum%2==0)
            {
                count=(count+nodd)%M;
                neven++;
            }
            else
            {
                count=(count+neven)%M;
                nodd++;
            }
        }
        return count;
    }
}