// Problem Number: 42
// Problem Name: Trapping Rain Water
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int lm=height[0];
        int rm=height[n-1];
        int m=0;
        int l=1;
        int r=n-2;
        while(l<=r)
        {
            if(lm<=rm)
            {
                if(height[l]>=lm)
                {
                    lm=height[l];
                }
                else
                {
                    m+=lm-height[l];
                }
                l++;
            }
            else
            {
                if(rm<height[r])
                {
                    rm=height[r];
                }
                else
                {
                    m+=rm-height[r];
                }
                r--;
            }
        }
        return m;

    }
}