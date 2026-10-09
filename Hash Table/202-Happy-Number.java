// Problem Number: 202
// Problem Name: Happy Number
// Time Complexity: O(n²)
// Space Complexity: O(n)

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>hs=new HashSet<>();
        while(!hs.contains(n))
        {
            hs.add(n);
            int t=0;
            int s=n;
            while(s!=0)
            {
                int m=s%10;
                t=t+(m*m);
                s/=10;
            }
            if(t==1)
            {
                return true;
            }
            else{
                n=t;
            }
        }
        return false;
    }
}