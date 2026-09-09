// Problem Number: 51
// Problem Name: N-Queens
// Difficulty: Hard
// Topic: Array, Backtracking, Algorithm X

public class Solution {
 public static ArrayList<String[]> solveNQueens(int n) {
    	assert(n>=0);
        ArrayList<String[]> res = new  ArrayList<String[]>();
        int[] queens = new int[n];
        placeQueens(res, queens, 0, n);
        return res;
    }
    
    public static void placeQueens(ArrayList<String[]> res, int[] queens, int row, int n){
        if (row == n) {
        	String[] puzzle = new String[n];
        	for(int i=0; i<queens.length; i++) {
        		char[] r = new char[n];
        		for (int j=0; j<n; j++) {
        			r[j] = '.';
        		}
        		r[queens[i]] = 'Q';
        		puzzle[i] = r.toString();
        	}
        	res.add(puzzle);
        } else {
        	for(int col=0; col<n; col++) {
        		if (isValid(queens, row, col)) {
        			queens[row] =  col;
        			placeQueens(res, queens, row+1, n);
        		}
        	}
        }
    }
    
    public static boolean isValid(int[] queens, int row, int col){
        for(int row2=0; row2<row; row2++) {
        	int col2 = queens[row];
        	if (col2==col)
        		return false;
        	
        	int colDist = Math.abs(col2-col);
        	int rowDist = Math.abs(row2-row);
        	if (colDist == rowDist)
        		return false;
        }
        return true;
    }
}