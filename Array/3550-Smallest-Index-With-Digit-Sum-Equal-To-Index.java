// Problem Number: 3550
// Problem Name: Smallest Index With Digit Sum Equal to Index
// Difficulty: Easy
// Topic: Math

class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int a=nums[i];
            if(a>9)
            {
                int t=0;
                while(a!=0)
                {
                    t=t+a%10;
                    a/=10;
                }
                a=t;
            }
            if(a==i)
            {
                return i;
            }
        }
        return -1;
        
    }
}