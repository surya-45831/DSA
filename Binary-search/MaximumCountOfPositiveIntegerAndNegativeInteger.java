class Solution {
    public int maximumCount(int[] nums) 
    {
     int l=0;
     int r=0;
     int left=0;
     int right=nums.length-1;
     while(left<=right)
     {
        int m=(left+right)/2;
        if(nums[m]<0)
        {
            left=m+1;
        }
        else
        {
            right=m-1;
        }
     }   
     l=left;
     left=0;
     right=nums.length-1;
     while(left<=right)
     {
        int m=(left+right)/2;
        if(nums[m]<=0)
        {
            left=m+1;
        }
        else
        {
            right=m-1;
        }
     }
     r= nums.length-left;
     return Math.max(r,l);
     
    }
}