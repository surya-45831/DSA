// Problem Number: 209
// Problem Name: Minimum Size Subarray Sum
// Difficulty: Medium
// Topic: Array, Binary Search, Sliding Window, Prefix Sum

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int sum=0;
        int s=Integer.MAX_VALUE;
        boolean b=false;
        for(int r=0;r<nums.length;r++)
        {
            sum=sum+nums[r];
            while(sum>=target)
            {
                s=Math.min(s,r-l+1);
                sum=sum-nums[l++];
            }
        }
        return s==Integer.MAX_VALUE?0:s;
    }
}