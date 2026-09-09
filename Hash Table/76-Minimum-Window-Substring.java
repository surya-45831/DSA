// Problem Number: 76
// Problem Name: Minimum Window Substring
// Difficulty: Hard
// Topic: Hash Table, String, Sliding Window

class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
        {
            return "";
        }
        int f[]=new int[63];
        for(int i=0;i<t.length();i++)
        {
            f[t.charAt(i)-'A']--;
        }
        boolean b=false;
        String p="";
        int l=0;
        for(int r=0;r<s.length();r++)
        {
            f[s.charAt(r)-'A']++;
            boolean w=true;
            for(int i=0;i<63;i++)
            {
                if(f[i]<0)
                {
                    w=false;
                    break;
                }
            }
            while(w)
            {
                if(!b)
                {
                    p=s.substring(l,r+1);
                    b=true;
                }
                else if(p.length()>r-l+1)
                {
                    p=s.substring(l,r+1);
                }
                f[s.charAt(l)-'A']--;
                l++;
                for(int i=0;i<63;i++)
                {
                    if(f[i]<0)
                    {
                        w=false;
                        break;
                    }
                }
            }
        }
        return p;
    }
}