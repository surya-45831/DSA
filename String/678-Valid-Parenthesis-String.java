// Problem Number: 678
// Problem Name: Valid Parenthesis String
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public boolean checkValidString(String s) {
        int l=0;
        int r=0;
        int m=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                l++;
            }
            else if(s.charAt(i)==')')
            {
                r++;
            }
            else
            {
                m++;
            }
            if(r>l+m)
            {
                return false;
            }
        }
        l=0;
        m=0;
        r=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==')')
            {
                l++;
            }
            else if(s.charAt(i)=='(')
            {
                r++;
            }
            else
            {
                m++;
            }
            if(r>l+m)
            {
                return false;
            }
        }
        return true;
    }
}