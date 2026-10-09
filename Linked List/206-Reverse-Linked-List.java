// Problem Number: 206
// Problem Name: Reverse Linked List
// Time Complexity: O(n)
// Space Complexity: O(1)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode rev=null;
        while(head!=null)
        {
            ListNode t=head;
            head=head.next;
            t.next=rev;
            rev=t;
        }
        return rev;
    }
}