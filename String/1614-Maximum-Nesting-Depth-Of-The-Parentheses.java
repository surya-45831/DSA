// Problem Number: 1614
// Problem Name: Maximum Nesting Depth of the Parentheses
// Difficulty: Easy
// Topic: String

class Solution {
    public int maxDepth(String s) {
        int d=0;
        int m=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                d++;
            }
            else if(s.charAt(i)==')')
            {
                d--;
            }
            m=Math.max(m,d);
        }
        return m;
    }
}