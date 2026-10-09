// Problem Number: 79
// Problem Name: Word Search
// Time Complexity: O(n²)
// Space Complexity: O(n²)

class Solution {
    static int n,m;
    static int arr[][];
    static String s;
    public boolean exist(char[][] board, String word) {
        n=board.length;
        m=board[0].length;
        arr=new int[n][m];
        s=word;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(find(i,j,0,board))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    static boolean find(int i,int j,int index,char w[][])
    {
        if(i<0||j<0||i>=n||j>=m||w[i][j]!=s.charAt(index)||arr[i][j]==1)
        {
            return false;
        }
        if(index==s.length()-1)
        {
            return true;
        }
        arr[i][j]=1;
        if(find(i,j+1,index+1,w))
        {
            return true;
        }
        if(find(i+1,j,index+1,w))
        {
            return true;
        }
        if(find(i,j-1,index+1,w))
        {
            return true;
        }
        if(find(i-1,j,index+1,w))
        {
            return true;
        }
        arr[i][j]=0;
        return false;
    }
}