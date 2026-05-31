class Solution {
    public int minCostConnectPoints(int[][] points) {
         
        HashMap<List<Integer>,Integer> visit=new HashMap<>();
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);//weight,x1,y1
        pq.add(new int[]{0,points[0][0],points[0][1]});
        
        int sum=0;
        
        while(!pq.isEmpty())
        {
            int[] temp=pq.poll();
            int wt=temp[0];
            int x1=temp[1];
            int y1=temp[2];
            if(visit.containsKey(Arrays.asList(x1,y1)))
            continue;
            sum+=wt;
            visit.put(Arrays.asList(x1,y1),1);

            int track[]=new int[3];
            for(int point[]:points)
            {
                if(visit.containsKey(Arrays.asList(point[0],point[1])))
                    continue;
                int currwt=Math.abs(x1-point[0])+Math.abs(y1-point[1]);
                track=new int[]{currwt,point[0],point[1]};
                pq.add(track);
            }
            
            

        }

        return sum;

    }

}