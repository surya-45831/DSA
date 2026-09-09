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
		ListNode *res = head;
		ListNode *rh = head;
		if (!head)
			return NULL;
		head = head->next;
		while (head) {
			if (head->val != res->val) {
				res->next = head;
			}
		}
		res->next = NULL;
		return rh;
    }
};