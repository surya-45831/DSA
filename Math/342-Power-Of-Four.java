// Problem Number: 342
// Problem Name: Power of Four
// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution {
    public boolean isPowerOfFour(int n) {

        return n > 0
            && (n & (n - 1)) == 0
            && (n & 0x55555555) != 0;
    }
}