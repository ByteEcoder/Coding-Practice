class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < flights.length; i++) {
            int u = flights[i][0];
            int v = flights[i][1];
            int cost = flights[i][2];
            graph.get(u).add(new int[] { v, cost });//node then cost 

        }
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->a[0]-b[0]);
        q.add(new int[]{0, src,0});//stop, node,cost
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        while(!q.isEmpty())
        {
            int temp[]=q.poll();
            int node=temp[1];
            int stop=temp[0];
            int cost=temp[2];
            if(stop>k)
                continue;
            for(int[] neigh:graph.get(node))
            {
                if(cost+neigh[1]<dist[neigh[0]])
                {
                    dist[neigh[0]]=cost+neigh[1];
                    q.add(new int[]{stop+1,neigh[0],dist[neigh[0]]});
                }
            }
        }
        
        if(dist[dst]==Integer.MAX_VALUE)
            return -1;
        return dist[dst];
        
    }
}