// Problem Number: 930
// Problem Name: Binary Subarrays With Sum
// Difficulty: Medium
// Topic: Array, Hash Table, Sliding Window, Prefix Sum

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return sub(nums,goal)-sub(nums,goal-1);
    }
    static int sub(int arr[],int g)
    {
        if(g<0)
        {
            return 0;
        }
        int c=0;
        int l=0;
        int s=0;
        for(int r=0;r<arr.length;r++)
        {
            s+=arr[r];
            while(s>g&&l<=r)
            {
                s-=arr[l];
                l++;
            }
            c+=r-l+1;
        }
        return c;
    }
}