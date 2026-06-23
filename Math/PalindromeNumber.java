class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int t=x;
        int a=0;
        while(t!=0)
        {
            a=a*10+t%10;
            t=t/10;
        }
        return x==a;
    }
}