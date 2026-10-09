// Problem Number: 3745
// Problem Name: Maximize Expression of Three Elements
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int m1=Math.max(nums[0],nums[1]);
        int m2=Math.min(nums[0],nums[1]);
        int m=Math.min(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            int x=nums[i];
            if(m1<x)
            {
                m2=m1;
                m1=x;
            }
            else if(m2<x)
            {
                m2=x;
            }
            if(m>x)
            {
                m=x;
            }
        }
        return m1+m2-m;
    }
}