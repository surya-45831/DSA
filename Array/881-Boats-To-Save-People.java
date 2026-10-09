// Problem Number: 881
// Problem Name: Boats to Save People
// Time Complexity: O(n log n)
// Space Complexity: O(1)

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int c=0;
        int l=0,r=people.length-1;
        while(l<=r)
        {
            if(people[l]+people[r]<=limit)
            {
                c++;
                l++;
                r--;
            }
            else
            {
                c++;
                r--;
            }
        }
        return c;
    }
}