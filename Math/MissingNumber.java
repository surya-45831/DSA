class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int t=(n*n+n)/2;
        int s=0;
        for(int m:nums)
        {
            s+=m;
        }
        return t-s;
    }
}