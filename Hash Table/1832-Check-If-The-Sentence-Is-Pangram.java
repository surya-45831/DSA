// Problem Number: 1832
// Problem Name: Check if the Sentence Is Pangram
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean b[]=new boolean[26];
        for(int i=0;i<sentence.length();i++)
        {
            b[sentence.charAt(i)-'a']=true;
        }
        for(int i=0;i<26;i++)
        {
            if(!b[i])
            {
                return false;
            }
        }
        return true;
    }
}