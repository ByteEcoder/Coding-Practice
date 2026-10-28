class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();

        solve(res,new ArrayList<>(),0,nums);
        return res;

    }
    public void solve(List<List<Integer>> res,List<Integer> sub,int i,int[] nums)
    {
        if(i==nums.length){
            res.add(new ArrayList<>(sub));
            return;
            }
        
        sub.add(nums[i]);
        solve(res,sub,i+1,nums);

        sub.remove(sub.size()-1);

        solve(res,sub,i+1,nums);
    }
}