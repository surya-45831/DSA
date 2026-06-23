class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s2=new StringBuilder();
        int i=0;
        int j=0;
        while(i<word1.length()&&j<word2.length())
        {
            s2.append(word1.charAt(i++));
            s2.append(word2.charAt(j++));
        }
        while(i<word1.length())
        {
            s2.append(word1.charAt(i++));
        }
        while(j<word2.length())
        {
            s2.append(word2.charAt(j++));
        }
        return s2.toString();

    }
}