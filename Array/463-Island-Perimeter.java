// Problem Number: 463
// Problem Name: Island Perimeter
// Difficulty: Easy
// Topic: Breadth-First Search

class Solution {
    public int islandPerimeter(int[][] grid) {
        int s=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    if(i-1<0||grid[i-1][j]==0)s++;
                    if(j-1<0||grid[i][j-1]==0)s++;
                    if(i+1>=n||grid[i+1][j]==0)s++;
                    if(j+1>=m||grid[i][j+1]==0)s++;
                }
            }
        }
        return s;
    }
}