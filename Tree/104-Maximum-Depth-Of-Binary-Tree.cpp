// Problem Number: 104
// Problem Name: Maximum Depth of Binary Tree
// Difficulty: Easy
// Topic: Tree, Depth-First Search, Breadth-First Search, Binary Tree

/**
 * Definition for binary tree
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    int maxDepth(TreeNode *root) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        if (root == NULL){
            return 0;
        }
        
        int depth_left = (root->left == NULL) ? 0 : maxDepth(root->left);
        int depth_right = (root->right == NULL) ? 0 : maxDepth(root->right);
        return 1 + max(depth_left, depth_right);
    }
};