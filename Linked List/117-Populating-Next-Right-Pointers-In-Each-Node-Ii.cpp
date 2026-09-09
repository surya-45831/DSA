// Problem Number: 117
// Problem Name: Populating Next Right Pointers in Each Node II
// Difficulty: Medium
// Topic: Linked List, Tree, Depth-First Search, Breadth-First Search, Binary Tree

/**
 * Definition for binary tree with next pointer.
 * struct TreeLinkNode {
 *  int val;
 *  TreeLinkNode *left, *right, *next;
 *  TreeLinkNode(int x) : val(x), left(NULL), right(NULL), next(NULL) {}
 * };
 */
class Solution {
public:
    void connect(TreeLinkNode *root) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        if( root == NULL ) return;
        
        TreeLinkNode *start = root;
        // not leaf
        while(start->left != NULL || start->right != NULL)
        {
            TreeLinkNode *level = start;
            // for each level
            while(level != NULL)
            {
                if(level->left != NULL && level->right != NULL)
                {
                    // level has two children
                    level->left->next = level->right;
                    
                    TreeLinkNode *temp = level->next;
                    while(temp != NULL)
                    {
                        if(temp->left == NULL && temp->right == NULL)
                            temp = temp->next;
                        else
                            break;
                    }
                    if(temp != NULL)
                    {
                        level->right->next = (temp->left == NULL) ? temp->right : temp->left;
                    }
                }
                else if(level->left != NULL)
                {
                    // level is not leaf, only has a left child
                    TreeLinkNode *temp = level->next;
                    while(temp != NULL)
                    {
                        if(temp->left == NULL && temp->right == NULL)
                            temp = temp->next;
                        else
                            break;
                    }
                    if(temp != NULL)
                    {
                        level->left->next = (temp->left == NULL) ? temp->right : temp->left;
                    }
                    
                }
                else if(level->right != NULL)
                {
                    // level is not leaf, has a right child
                     TreeLinkNode *temp = level->next;
                    while(temp != NULL)
                    {
                        if(temp->left == NULL && temp->right == NULL)
                            temp = temp->next;
                        else
                            break;
                    }
                    if(temp != NULL)
                    {
                        level->right->next = (temp->left == NULL) ? temp->right : temp->left;
                    }
                }
                else
                {
                    // level is leaf, ignore
                }
                level = level->next;
            }
            
            // next level, start would become the start node of next level and start cannot be leaf, there would be several cases
            if(start->left != NULL || start->right != NULL)
            {
                start = ( start->left != NULL) ? start->left : start->right;
            }
            else
            {
                // start is leaf
                TreeLinkNode *temp = start->next;
                // if temp is leaf too, go to next
                while(temp != NULL)
                {
                    if(temp->left == NULL && temp->right == NULL)
                        temp = temp->next;
                    else
                        break;
                }
                
                if(temp == NULL) start = NULL;
                else 
                    start = (temp->left != NULL) ? temp->left : temp->right;
            }
            
            // now start is the first node of next level, we need to check whether it is leaf
            while(start->left == NULL && start->rigth == NULL) start = start->next;
            
        }// while
        
        return;
    }
};