// Problem Number: 424
// Problem Name: Longest Repeating Character Replacement
// Difficulty: Medium
// Topic: Hash Table, String, Sliding Window

class Solution {
    public int characterReplacement(String s, int k) {
        int m=0;
        int l=0;
        int f=0;
        int[] fr = new int[26];
        for (int r=0;r<s.length();r++) {
            int in=s.charAt(r)-'A';
            fr[in]++;
            f=Math.max(f,fr[in]);
            while((r-l+1)-f>k) {
                fr[s.charAt(l)-'A']--;
                l++;
                for (int i=0;i<26;i++) 
                {
                    f=Math.max(f,fr[i]);
                }
            }
            m=Math.max(m,r-l+1);
        }
        return m;
    }
}