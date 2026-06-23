class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            boolean b=true;
            int l=0;
            int m=s.length()-1;
            while(l<m)
            {
                if(s.charAt(l)!=s.charAt(m))
                {
                    b=false;
                    break;
                }
                l++;
                m--;
            }
            if(b)
            {
                return s;
            }
        }
        return "";
    }
}