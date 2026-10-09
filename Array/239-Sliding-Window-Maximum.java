// Problem Number: 239
// Problem Name: Sliding Window Maximum
// Time Complexity: O(n³)
// Space Complexity: O(n)

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        if(n<=1)
        {
            return nums;
        }
        int l=0;
        int arr[]=new int[n-k+1];
        Deque<Integer>dq=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            while(!dq.isEmpty()&&dq.peekFirst()<=i-k)
            {
                dq.pollFirst();
            }
            while(!dq.isEmpty()&&nums[dq.peekLast()]<=nums[i])
            {
                dq.pollLast();
            }
            dq.addLast(i);
            if(i>=k-1)
            {
                arr[l++]=nums[dq.peekFirst()];
            }
        }
        return arr;
    }
}