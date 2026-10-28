class Solution {
    public boolean search(int[] nums, int target) {

        int h=nums.length-1;
        int l=0;

        while(l<=h)
        {
            int mid=(l+h)/2;
            if (target==nums[mid])
                return true;
            if (nums[l]==nums[mid]&& nums[mid]==nums[h])
            {
                l++;
                h--;
                
                continue;
            }

            if(nums[l]<=nums[mid])// left half sorted
            {
                if(nums[l]<=target && nums[mid]>=target)
                    {
                        h=mid-1;
                    }
                else
                    {
                        l=mid+1;
                    }
            }

            else{                   
                if(nums[h]>=target && nums[mid]<=target)
                {
                    l=mid+1;
                }
                else
                {
                    h=mid-1;
                }
            }
        }

        return false;
    }
}