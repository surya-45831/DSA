// Problem Number: 51
// Problem Name: N-Queens
// Difficulty: Hard
// Topic: Backtracking

class Solution {
    List<List<String>> al;
    char s[][];
    public List<List<String>> solveNQueens(int n) {
        al=new ArrayList<>();
        s=new char[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(s[i],'.');
        }
        find(0);
        return al;
    }
    void find(int i)
    {
        if(i==s.length)
        {
            List<String> p=new ArrayList<>();
            for(int l=0;l<s.length;l++)
            {
                p.add(new String(s[l]));
            }
            al.add(p);
            return;
        }
        for(int l=0;l<s.length;l++)
        {
            if(safe(i,l))
            {
                s[i][l]='Q';
                find(i+1);
                s[i][l]='.';
            }
        }
    }
    boolean safe(int i,int j)
    {
        int r=i;
        int c=j;
        for(int l=0;l<i;l++)
        {
            if(s[l][c]=='Q')
            {
                return false;
            }
        }
        r=r-1;
        c=c-1;
        while(r>=0&&c>=0)
        {
            if(s[r][c]=='Q')
            {
                return false;
            }
            r--;
            c--;
        }
        r=i-1;
        c=j+1;
        while(r>=0&&c<s.length)
        {
            if(s[r][c]=='Q')
            {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}