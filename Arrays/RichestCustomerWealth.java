class Solution {
    public int maximumWealth(int[][] accounts) {
        int r=accounts.length;
        int c=accounts[0].length;
        int sum=0;
        for(int i=0;i<r;i++)
        {
            int co=0;
            for(int j=0;j<c;j++)
            {
                co+=accounts[i][j];
            }
            if(sum<co)
            {
                sum=co;
            }
        }
        return sum;

    }
}