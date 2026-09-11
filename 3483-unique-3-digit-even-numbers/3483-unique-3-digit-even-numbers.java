class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
           
            if(digits[i]==0)
                continue;

            for(int j=0;j<n;j++)
            {   
                if(i==j)
                    continue;
        
                for(int k=0;k<n;k++)
                {
                    int curr=100*digits[i]+10*digits[j]+digits[k];
                    if(i==k||j==k||digits[k]%2!=0||map.containsKey(curr))
                        continue;
                    map.put(curr,1);
                    
                }
            }
        }
        return map.size();
    }
}