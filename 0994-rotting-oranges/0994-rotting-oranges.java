class Solution {
    public int orangesRotting(int[][] grid) {
    int n=grid.length;
    int m=grid[0].length;
    Queue<List<Integer>> q=new ArrayDeque<>();
        int rot=0;
        int fresh=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                   { q.add(Arrays.asList(i, j));
                    rot++;
                   }
                if(grid[i][j]==1)
                    fresh++;
            }
        }
        if(fresh==0)
            return 0;
        if(rot==0 && fresh!=0)
            return -1;
        int days=0;
        while(!q.isEmpty())
        {
            int rotten=q.size();  //q<(0,1),(1,0)>
            boolean flag=false;
            while(rotten!=0)
            {
                List<Integer> temp=q.poll();
                int r=temp.get(0);
                int c=temp.get(1);
                if(c+1<m && grid[r][c+1]==1)//right c=0,r=0
                {
                    grid[r][c+1]=2;
                    q.add(Arrays.asList(r, c+1)); //q<(0,1)>
                    flag=true;
                    fresh--;
                }
                if(c-1>=0 && grid[r][c-1]==1)//left
                {
                    grid[r][c-1]=2;
                    q.add(Arrays.asList(r, c-1));
                    flag=true;
                    fresh--;
                }
                if(r-1>=0 && grid[r-1][c]==1)//top
                {
                    grid[r-1][c]=2;
                    q.add(Arrays.asList(r-1, c));
                    flag=true;
                    fresh--;
                }
                if(r+1<n && grid[r+1][c]==1)//down
                {
                    grid[r+1][c]=2;
                    q.add(Arrays.asList(r+1, c));
                    flag=true;
                    fresh--;
                }

                rotten--;
            }

            if(flag==true)
                days++;
            
        }
        if(fresh!=0)
            return -1;
        return days;
    }
}