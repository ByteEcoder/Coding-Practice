class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        int n=nums.length;
        int max=1;
        int I=1;
        int D=1;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                I++;
                max=Math.max(max,I);
                D=1;
            }
            if(nums[i]>nums[i+1])
            {
                D++;
                max=Math.max(max,D);
                I=1;
            }
            if(nums[i]==nums[i+1])
            {
                I=1;
                D=1;
            }
        }
        return max;
    }
}