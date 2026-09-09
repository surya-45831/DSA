// Problem Number: 98
// Problem Name: Validate Binary Search Tree
// Difficulty: Medium
// Topic: Tree, Depth-First Search, Binary Search Tree, Binary Tree

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null) return false;
        return validBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public boolean validBST(TreeNode root, int min, int max){
        if(root == null) return true;
        if(root.val <= min || root.val >= max) return false;
        return validBST(root.left, min, root.val) && validBST(root.right, root.val, max);
    }
}