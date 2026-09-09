// Problem Number: 24
// Problem Name: Swap Nodes in Pairs
// Difficulty: Medium
// Topic: Linked List, Recursion

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
    public ListNode swapPairs(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head==null||head.next==null) return head;
        ListNode slow=head, fast=slow.next, ret=head.next;
        while(slow!=null && fast!=null) {
            ListNode tmp=fast.next;
            fast.next=slow;
            if(tmp==null || tmp.next==null) slow.next=tmp;
            else slow.next=tmp.next;
            slow=tmp;
            if(slow!=null) fast=slow.next;
            else fast=null;
        }
        return ret;
    }
}