// Problem Number: 507
// Problem Name: Perfect Number
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public boolean checkPerfectNumber(int num) {
        if(num==1)return false;
        int c=1;
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                c+=i;
                c=c+num/i;
            }
        }
        return c==num;
    }
}