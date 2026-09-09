// Problem Number: 55
// Problem Name: Jump Game
// Difficulty: Medium
// Topic: Array, Dynamic Programming, Greedy

public class Solution {
    public boolean canJump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (A.length == 0) return false;
        boolean[] array = new boolean[A.length];
        array[0] = true;
        
        for (int i=0; i<A.length; i++) {
            if (array[i] == false) continue;
            else {
                int jum = A[i];
                for (int j = 1; j<=jum; j++) {
                    if (i+j < A.length) array[i+j] = true;
                    else break;
                }
            }
        }
        return array[A.length-1];
    }
}