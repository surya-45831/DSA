// Problem Number: 50
// Problem Name: Pow(x, n)
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public double myPow(double x, int n) {
        long l=n;
        if(l<0)
        {
            l=-l;
            x=1/x;
        }
        return find(x,l);
    }
    static double find(double x,long n)
    {
        if(n==0)
        {
            return 1;
        }
        double a=find(x,n/2);
        if(n%2==0)
        {
            return a*a;
        }
        return a*a*x;
    }
}