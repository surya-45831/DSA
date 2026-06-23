class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        if(n>s2.length())
        {
            return false;
        }
        int f[]=new int[26];
        for(int i=0;i<n;i++)
        {
            f[s1.charAt(i)-'a']--;
            f[s2.charAt(i)-'a']++;
        }
        int c=0;
        for(int i=0;i<26;i++)
        {
            if(f[i]!=0)
            {
                c=-1;
                break;
            }
        }
        if(c==0)
        {
            return true;
        }
        for(int i=n;i<s2.length();i++)
        {
            f[s2.charAt(i)-'a']++;
            f[s2.charAt(i-n)-'a']--;
            c=0;
            for(int j=0;j<26;j++)
            {
                if(f[j]!=0)
                {
                    c=-1;
                    break;
                }
            }
            if(c==0)
            {
                return true;
            }
        }
        return false;
    }
}