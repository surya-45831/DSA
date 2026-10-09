// Problem Number: 94
// Problem Name: Binary Tree Inorder Traversal
// Time Complexity: O(1)
// Space Complexity: O(n)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static  List<Integer>a=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        a.clear();
        inorder(root);
        return a;
    }
    static void inorder(TreeNode h)
    {
        if(h==null)
        {
            return;
        }
        inorder(h.left);
        a.add(h.val);
        inorder(h.right);
    }
}