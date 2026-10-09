// Problem Number: 856
// Problem Name: Score of Parentheses
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int scoreOfParentheses(String s) {
        int c=0;
        int d=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                d++;
            }
            else
            {
                d--;
                if(s.charAt(i-1)=='(')
                {
                    c+=Math.pow(2,d);
                }
            }
        }
        return c;
    }
}