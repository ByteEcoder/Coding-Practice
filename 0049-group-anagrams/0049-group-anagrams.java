class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> res=new LinkedList<>();

        int n=strs.length;

        for(int i=0;i<n;i++)
        {
            char[] stc=strs[i].toCharArray();
            Arrays.sort(stc);
            String st=new String(stc);

            if(map.containsKey(st))
            map.get(st).add(strs[i]);
            else
            {
                List<String> list=new LinkedList<>();
                list.add(strs[i]);
                map.put(st,list);
            }
        }
        for(String key:map.keySet())
        {
            res.add(map.get(key));
        }

        return res;
    }
}