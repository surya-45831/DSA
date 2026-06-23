class Solution {
    public boolean isPalindrome(String s) {
        int v=1;
        int i=0;
        int j=s.length()-1;
        s=s.toLowerCase();
        while(i<=j)
        {
            if(Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j)))
            {
                if(s.charAt(i)!=s.charAt(j))
                {
                    v=0;
                    break;
                }
                i++;
                j--;
            }
            else if(Character.isLetterOrDigit(s.charAt(i)))
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return v==1;
    }
}