// Problem Number: 86
// Problem Name: Partition List
// Difficulty: Medium
// Topic: Linked List, Two Pointers

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *partition(ListNode *head, int x) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        ListNode* leftPartFirst = NULL, *leftPartLast = NULL, *rightPartFirst = NULL, *rightPartLast = NULL;
        ListNode* curr = head;
        while(curr != NULL) {
            if(curr->val < x) {
                if(leftPartFirst == NULL) {
                    leftPartFirst = curr;
                    leftPartLast = curr;
                }
                else {
                    leftPartLast->next = curr;
                    leftPartLast = leftPartLast->next;
                }
            }
            else {
                if(rightPartFirst == NULL) {
                    rightPartFirst = curr;
                    rightPartLast = curr;
                }
                else{
                    rightPartLast->next = curr;
                    rightPartLast = rightPartLast->next;
                }
            }
            curr = curr->next;
        }
    
    if(leftPartFirst == NULL) return rightPartFirst;
    else {
        leftPartLast->next = rightPartFirst;
        rightPartLast->next = NULL;
        return leftPartFirst;
    }
    }
};