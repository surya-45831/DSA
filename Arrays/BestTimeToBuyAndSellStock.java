class Solution {
    public int maxProfit(int[] prices) {
        int m=Integer.MAX_VALUE;
        int p=0;
        for(int l:prices)
        {
            if(l<m)
            {
                m=l;
            }
            else
            {
                if(l-m>p)
                {
                    p=l-m;
                }
            }
        }
        return p;
    }
}