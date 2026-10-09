// Problem Number: 633
// Problem Name: Sum of Square Numbers
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean judgeSquareSum(int c) {
        int l=0;
        int r=(int)Math.sqrt(c);
        while(l<=r)
        {
            long x=(long)l*l+(long)r*r;
            if(x==c)
            {
                return true;
            }
            else if(x>c)
            {
                r--;
            }
            else
            {
                l++;
            }
        }
        return false;
    }
}