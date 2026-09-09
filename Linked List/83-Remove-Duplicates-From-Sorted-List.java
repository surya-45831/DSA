// Problem Number: 83
// Problem Name: Remove Duplicates from Sorted List
// Difficulty: Easy
// Topic: Linked List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head == null || head.next == null) {
            return head;
        }
        ListNode c = head;
        ListNode n = head.next;
        while(n!=null) {
            if(c.val == n.val) {
                n = n.next;
            }else {
                c.next = n;
                c = n;
                n = n.next;
            }
        }
        if(c == head) {
            c.next = n;
        }
        return head;
    }
}