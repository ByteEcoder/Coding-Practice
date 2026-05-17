class Solution {

    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int v[]:edges)
        {
            graph.get(v[0]).add(v[1]);
            graph.get(v[1]).add(v[0]);
        }
        boolean visit[]=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(!visit[i])
            {
               int[] e = new int[1];
                int[] v = new int[1];

                dfs(graph, visit, i, e, v);

                if(e[0] == v[0] * (v[0] - 1)) 
                    count++;
            }
            
        }
        return count;
    }

    public void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visit, int node, int[] e, int[] v) 
    {
        v[0]++;
        visit[node] = true;
        for (int neigh : graph.get(node)) 
        {
            e[0]++;
            if (!visit[neigh]) 
            {

                dfs(graph, visit, neigh, e, v);
            }

        }

    }
}