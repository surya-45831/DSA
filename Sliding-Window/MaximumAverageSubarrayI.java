class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        int m=sum;
        for(int i=k;i<nums.length;i++)
        {
            sum=sum-nums[i-k]+nums[i];
            m=Math.max(m,sum);
        }
        return (double)m/k;
    }
}