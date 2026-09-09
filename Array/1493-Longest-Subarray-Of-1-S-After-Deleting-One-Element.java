// Problem Number: 1493
// Problem Name: Longest Subarray of 1's After Deleting One Element
// Difficulty: Medium
// Topic: Array, Dynamic Programming, Sliding Window

class Solution {
    public int longestSubarray(int[] nums) {
        int l=0;
        int c=0;
        int z=0;
        for(int r=0;r<nums.length;r++)
        {
            if(nums[r]==0)
            {
                z++;
            }
            while(z>1)
            {
                if(nums[l]==0)
                {
                    z--;
                }
                l++;
            }
            c=Math.max(c,r-l+1);
        }
        return c-1;
    }
}