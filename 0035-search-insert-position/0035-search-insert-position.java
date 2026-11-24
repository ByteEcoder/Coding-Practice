class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        int si=0;
        int ei=nums.length-1;
         while(si<=ei)
        {
            int m=(si+ei)/2;
            if (nums[m]==target)
                return m;
            
            else if (nums[m]>target)
                ei=m-1;
            
            else if(nums[m]< target)
                si=m+1;
            
            
        
        }
        return si;
    }
}