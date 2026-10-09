// Problem Number: 1004
// Problem Name: Max Consecutive Ones III
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int m=0;
        int z=0;
        while(r<nums.length)
        {
            if(nums[r]==0)
            {
                z++;
            }
            while(z>k)
            {
                if(nums[l]==0)
                {
                    z--;
                }
                l++;
            }
            m=Math.max(m,r-l+1);
            r++;
        }
        return m;
    }
}