// Problem Number: 22
// Problem Name: Generate Parentheses
// Time Complexity: O(1)
// Space Complexity: O(n)

class Solution {
    static ArrayList<String>al=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        al.clear();
        find(new StringBuilder(),0,0,n);
        return al;
    }
    static void find(StringBuilder s,int o,int c,int n)
    {
        if(s.length()==2*n)
        {
            al.add(new String(s));
            return;
        }
        if(o<n)
        {
            s.append('(');
            find(s,o+1,c,n);
            s.deleteCharAt(s.length()-1);
        }
        if(c<o)
        {
            s.append(')');
            find(s,o,c+1,n);
            s.deleteCharAt(s.length()-1);
        }
    }
}