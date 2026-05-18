class Solution {
    int n,m;
    public int orangesRotting(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        int[][] time=new int[n][m];
        int count=0;
        for(int i[]:time)
        {
            Arrays.fill(i,Integer.MAX_VALUE);
        }
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if( grid[i][j]==2)
                    {
                        dfs(grid,time,i,j,0);
                    }
            }
        }
        
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1 && time[i][j]==Integer.MAX_VALUE)
                    return -1;

                if(grid[i][j]==1)
                count=Math.max(count,time[i][j]);
            }
        }
        return count;


    }

    public void dfs(int[][] grid,int[][] time,int i, int j,int t)
    {
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0 || t>time[i][j])
            return ;
        
        time[i][j]=t;
        
        dfs(grid,time,i-1,j,t+1);
        dfs(grid,time,i+1,j,t+1);
        dfs(grid,time,i,j-1,t+1);
        dfs(grid,time,i,j+1,t+1);
        
    }
}