class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m=0;
        int c=0;
        for(int n:nums)
        {
            if(n==1)
            {
                c++;
            }
            else
            {
                if(m<c)
                {
                    m=c;
                }
                c=0;
            }
        }
        if(m<c)
        {
            m=c;
        }
        return m;
    }
}