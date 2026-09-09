// Problem Number: 124
// Problem Name: Binary Tree Maximum Path Sum
// Difficulty: Hard
// Topic: Dynamic Programming, Tree, Depth-First Search, Binary Tree, DP on Trees

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
    int maxPathSum(TreeNode *root) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        int cmax = 0;
        int maxValue = INT_MIN;
        maxHelper(root, cmax, maxValue);
        return maxValue;
    }
    
    void maxHelper(TreeNode *root, int &cmax, int &maxValue){
        if(root){
            int left, right;
            maxHelper(root->left, left, maxValue);
            maxHelper(root->right, right, maxValue);
            cmax = max(cmax, max(left, right) + root->val);
            maxValue = max(left + root->val + right, max(maxValue, cmax));
        }
    }
};