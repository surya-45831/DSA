// Problem Number: 542
// Problem Name: 01 Matrix
// Difficulty: Medium
// Topic: Breadth-First Search

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int arr[][]=new int[n][m];
        Queue<int[]>q=new LinkedList<>();
        boolean b[][]=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    q.add(new int[]{i,j});
                    b[i][j]=true;
                }
            }
        }
        int v=0;
        while(!q.isEmpty())
        {
            int s=q.size();
            for(int i=0;i<s;i++)
            {
                int p[]=q.poll();
                int r=p[0];
                int c=p[1];
                if(mat[r][c]==1)
                {
                    arr[r][c]=v;
                }
                if(r+1<n&&!b[r+1][c])
                {
                    q.add(new int[]{r+1,c});
                    b[r+1][c]=true;
                }
                if(r-1>=0&&!b[r-1][c])
                {
                    q.add(new int[]{r-1,c});
                    b[r-1][c]=true;
                }
                if(c+1<m&&!b[r][c+1])
                {
                    q.add(new int[]{r,c+1});
                    b[r][c+1]=true;
                }
                if(c-1>=0&&!b[r][c-1])
                {
                    q.add(new int[]{r,c-1});
                    b[r][c-1]=true;
                }
            }
            v++;
        }
        return arr;
    }
}