// Problem Number: 164
// Problem Name: Maximum Gap
// Time Complexity: O(n log n)
// Space Complexity: O(1)

class Solution {
    public int maximumGap(int[] nums) {
        int m=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            m=Math.max(m,nums[i+1]-nums[i]);
        }
        return m;
    }
}