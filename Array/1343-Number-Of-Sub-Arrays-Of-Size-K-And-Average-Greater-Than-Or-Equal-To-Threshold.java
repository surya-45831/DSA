// Problem Number: 1343
// Problem Name: Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c=0;
        int s=0;
        for(int i=0;i<k;i++)
        {
            s+=arr[i];
        }
        if(threshold<=s/k)
        {
            c++;
        }
        for(int i=k;i<arr.length;i++)
        {
            s=s-arr[i-k]+arr[i];
            if(s/k>=threshold)
            {
                c++;
            }
        }
        return c;
    }
}