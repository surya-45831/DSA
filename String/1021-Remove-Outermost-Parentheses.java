// Problem Number: 1021
// Problem Name: Remove Outermost Parentheses
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public String removeOuterParentheses(String s) {
        int d=0;
        StringBuilder a=new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                if(d==0)
                {
                    d++;
                    continue;
                }
                d++;
                a.append(s.charAt(i));
            }
            else
            {
                if(d==1)
                {
                    d--;
                    continue;
                }
                d--;
                a.append(s.charAt(i));
            }
        }
        return a.toString();
    }
}