// Problem Number: 921
// Problem Name: Minimum Add to Make Parentheses Valid
// Difficulty: Medium
// Topic: String

class Solution {
    public int minAddToMakeValid(String s) {
        int l=0;
        int r=0;
        int t=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                l++;
            }
            else
            {
                r++;
                if(r>l)
                {
                    t++;
                    r--;
                }
            }
        }
        if(l!=r)
        {
            t+=Math.abs(r-l);
        }
        return t;
    }
}