class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n=arr1.length;
        int m=arr2.length;
        int res=0;
        
        for(int i=0;i<n;i++)
        {
            boolean got=false;
        
            for(int j=0;j<m;j++)
            {   
                int temp=Math.abs(arr1[i]-arr2[j]);

                if(temp<=d)
                {   
                        got=true;
                        break;   
                }
            }

            if(got==false)
                res++;
            
        }

        return res;
    }
}