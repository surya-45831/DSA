// Problem Number: 16
// Problem Name: 3Sum Closest
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int m=nums[0]+nums[1]+nums[2];
        int d=Math.abs(target-m);
        if(d==0)
        {
            return m;
        }
        int n=nums.length;
        int s=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++)
        {
            int l=i+1;
            int r=n-1;
            while(l<r)
            {
                m=nums[i]+nums[l]+nums[r];
                if(d>Math.abs(target-m))
                {
                    d=Math.abs(target-m);
                    s=m;
                    
                }
                if(d==0)
                {
                    return m;
                }
                else if(m<target)
                {
                    l++;
                }
                else
                {
                    r--;
                }
            }
        }
        return s;
    }
}