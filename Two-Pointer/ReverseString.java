class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int h=s.length-1;
        while(i<h)
        {
            char ch=s[i];
            s[i]=s[h];
            s[h]=ch;
            i++;
            h--;
        }
    }
}