class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[]=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,1)+1);
        }
        for(int i=0;i<k;i++)
        {
            int max=0;int ele=0;
            for(int key: map.keySet())
            {
                if(max<map.get(key))
                {
                    ele=key;
                    max=map.get(key);
                }
            }
            res[i]=ele;
            map.remove(ele);
        }
        return res;
    }
}