// Problem Number: 2011
// Problem Name: Final Value of Variable After Performing Operations
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations) {
            if ("X++".equals(op) || "++X".equals(op)) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}