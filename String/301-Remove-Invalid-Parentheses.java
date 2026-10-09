// Problem Number: 301
// Problem Name: Remove Invalid Parentheses
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    List<String>al=new ArrayList<>();
    Set<String>ch=new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        int ri=0;
        int ro=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                ri++;
            }
            else if(s.charAt(i)==')')
            {
                if(ri>0)
                {
                    ri--;
                }
                else
                {
                    ro++;
                }
            }
        }
        find(0,s,0,ri,ro,"");
        return al;
    }
        void find(int i,String s,int b,int ri,int ro,String n)
        {
            if(b<0)
            {
                return;
            }
            if(i==s.length())
            {
                if(b==0&&ri==0&&ro==0&&!ch.contains(n))
                {
                    al.add(new String(n));
                    ch.add(new String(n));
                }
                return;
            }
            if(s.charAt(i)!='('&&s.charAt(i)!=')')
            {
                find(i+1,s,b,ri,ro,n+s.charAt(i));
            }
            if(s.charAt(i)=='('&&ri>0)
            {
                find(i+1,s,b,ri-1,ro,n);
            }
            if(s.charAt(i)==')'&&ro>0)
            {
                find(i+1,s,b,ri,ro-1,n);
            }
            if(s.charAt(i)=='(')
            {
                find(i+1,s,b+1,ri,ro,n+s.charAt(i));
            }
            if(s.charAt(i)==')')
            {
                find(i+1,s,b-1,ri,ro,n+s.charAt(i));
            }

        }
}