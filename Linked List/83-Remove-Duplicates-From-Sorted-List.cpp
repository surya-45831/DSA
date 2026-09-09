// Problem Number: 83
// Problem Name: Remove Duplicates from Sorted List
// Difficulty: Easy
// Topic: Linked List

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
    ListNode *deleteDuplicates(ListNode *head) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        if (head == NULL){
            return NULL;
        }
        ListNode *list = head;
        ListNode *node = head;
        ListNode *prev = head;
        node = node->next;
        while(node != NULL){
            if (node->val == prev->val){
                prev->next = node->next;
                node->next = NULL;
                node = prev->next;
            }
            else{
                node = node->next;
                prev = prev->next;
            }
        }
        return list;
    }
};