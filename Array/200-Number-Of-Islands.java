// Problem Number: 200
// Problem Name: Number of Islands
// Time Complexity: O(n²)
// Space Complexity: O(n²)

class Solution {
    public int numIslands(char[][] grid) {
        int co=0;
        int r=grid.length;
        int c=grid[0].length;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]== '1'){
                    co++;
                    dfs(i,j,grid);
                }
            }
        }
        return co;
    }
    void dfs(int i, int j, char[][] grid){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0')
            return;
        grid[i][j]='0';
        dfs(i-1,j,grid);
        dfs(i+1,j,grid);
        dfs(i,j-1,grid);
        dfs(i,j+1,grid);
    }
}