class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>l=new HashSet<>();
        int t=0;
        int i=0;
        int le=0;
        while(i<s.length())
        {
            if(!l.contains(s.charAt(i)))
            {
                l.add(s.charAt(i));
                i++;
                t=Math.max(t,l.size());
            }
            else
            {
                l.remove(s.charAt(le++));

            }
        }
        return t;
    }
}