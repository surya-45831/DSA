// Problem Number: 231
// Problem Name: Power of Two
// Difficulty: Easy
// Topic: Bit Manipulation

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0&&Integer.bitCount(n)==1;
    }
}