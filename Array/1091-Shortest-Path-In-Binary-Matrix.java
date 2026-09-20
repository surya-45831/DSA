// Problem Number: 1091
// Problem Name: Shortest Path in Binary Matrix
// Difficulty: Medium
// Topic: Breadth-First Search

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[n-1][n-1]==1||grid[0][0]==1)
        {
            return -1;
        }
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{0,0,1});
        int d[]={1,-1,0,0,-1,1,-1,1};
        int d2[]={1,-1,-1,1,0,0,1,-1};
        while(!q.isEmpty())
        {
            int p[]=q.poll();
            int r=p[0];
            int c=p[1];
            int v=p[2];
            if(r==n-1&&c==n-1)
            {
                return v;
            }
            for(int i=0;i<8;i++)
            {
                int w=r+d[i];
                int e=c+d2[i];
                if(w>=0&&e>=0&&w<n&&e<n&&grid[w][e]==0)
                {
                    grid[w][e]=1;
                    q.add(new int[]{w,e,v+1});
                }
            }
        }
        return -1;
    }
}