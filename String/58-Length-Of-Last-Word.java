// Problem Number: 58
// Problem Name: Length of Last Word
// Difficulty: Easy
// Topic: String

public class Solution {
    public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String[] str = s.split(" +");
        return str[str.length-1].length();
    }
}