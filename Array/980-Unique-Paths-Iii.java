// Problem Number: 980
// Problem Name: Unique Paths III
// Difficulty: Hard
// Topic: Array, Backtracking, Bit Manipulation, Matrix, Hamiltonian Path

class Solution {
    static int n,m,count;
    static int sol[][];
    static int d1=-1,d2=-1,max=0;
    public int uniquePathsIII(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        sol=new int[n][m];
        int s1=-1,s2=-1;
        count=0;
        d1=-1;
        d2=-1;
        int mi=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    s1=i;
                    s2=j;
                }
                else if(grid[i][j]==2)
                {
                    d1=i;
                    d2=j;
                }
                else if(grid[i][j]==-1)
                {
                    mi++;
                }
            }
        }
        max=n*m-mi;
        find(s1,s2,grid,1);
        return count;
    }
    static void find(int i,int j,int arr[][],int st)
    {
        if(i<0||j<0||i>=n||j>=m||arr[i][j]==-1||sol[i][j]==1)
        {
            return;
        }
        if(i==d1&&j==d2&&max==st)
        {
            count++;
            return;
        }
        sol[i][j]=1;
        find(i-1,j,arr,st+1);
        find(i+1,j,arr,st+1);
        find(i,j-1,arr,st+1);
        find(i,j+1,arr,st+1);
        sol[i][j]=0;
        return;
    }
}