// Problem Number: 129
// Problem Name: Sum Root to Leaf Numbers
// Difficulty: Medium
// Topic: Tree, Depth-First Search, Binary Tree

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
    void sumFunction(TreeNode *root, int *sum,int s){
        if(root==NULL)
            return;
        else if (root->left==NULL && root->right==NULL)
            *sum=(*sum)+s*10+root->val;
        else{
            sumFunction(root->left,sum,s*10+root->val);
            sumFunction(root->right,sum,s*10+root->val);
        }
    } 
    int sumNumbers(TreeNode *root) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        int sum=0;
        int s=0;
        sumFunction(root,&sum,s);
        return sum;
        
    }
};
