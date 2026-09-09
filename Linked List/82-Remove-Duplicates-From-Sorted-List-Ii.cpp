// Problem Number: 82
// Problem Name: Remove Duplicates from Sorted List II
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
    ListNode *deleteDuplicates(ListNode *head) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        if(head==NULL||head->next==NULL)return head;
        ListNode* ptr1,*ptr2,*ptr3;
        ptr1=head->next;
        int p1=head->val;
        ptr2=head;
        ptr3=NULL;
        while(ptr1!=NULL){
            if(ptr1->val==p1){
                ptr2=ptr3;
                ptr1=ptr1->next;
            }
            else if(ptr2==NULL){
                ptr3=NULL;
                ptr2=ptr1;
             head=ptr2;
                ptr1=ptr1->next;
                p1=ptr2->val;
            }
            else{
                ptr3=ptr2;
                ptr2->next=ptr1;
                ptr2=ptr1;
                ptr1=ptr1->next;
                p1=ptr2->val;
             
            }
        }
        if(ptr2==NULL)return NULL;
        ptr2->next=NULL;
        return head;
    }
};