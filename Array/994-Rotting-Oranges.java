// Problem Number: 994
// Problem Name: Rotting Oranges
// Time Complexity: O(n³)
// Space Complexity: O(n²)

class Solution {
    public int orangesRotting(int[][] grid) {
      Queue<int[]>q=new LinkedList<>();
      int f=0;
      for(int i=0;i<grid.length;i++)
       {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j]==1)
                {
                    f++;
                }
            }
        }
        int v=0;
        while(!q.isEmpty()&&f!=0)
        {
            int s=q.size();
            for(int i=0;i<s;i++)
            {
                int p[]=q.poll();
                int r=p[0];
                int c=p[1];
                if(r+1<grid.length&&grid[r+1][c]==1)
                {
                    q.add(new int[]{r+1,c});
                    f--;
                    grid[r+1][c]=2;
                }
                if(r-1>=0&&grid[r-1][c]==1)
                {
                    q.add(new int[]{r-1,c});
                    f--;
                    grid[r-1][c]=2;
                }
                if(c+1<grid[0].length&&grid[r][c+1]==1)
                {
                    q.add(new int[]{r,c+1});
                    f--;
                    grid[r][c+1]=2;
                }
                if(c-1>=0&&grid[r][c-1]==1)
                {
                    q.add(new int[]{r,c-1});
                    f--;
                    grid[r][c-1]=2;
                }
            }
            v++;
        }
        return f==0?v:-1;
    }
}