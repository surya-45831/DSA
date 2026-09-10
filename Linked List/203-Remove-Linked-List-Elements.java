// Problem Number: 203
// Problem Name: Remove Linked List Elements
// Difficulty: Easy
// Topic: Linked List

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
    public ListNode removeElements(ListNode head, int val) {
        ListNode d=new ListNode(0);
        ListNode t=d;
        while(head!=null)
        {
            if(head.val!=val)
            {
                t.next=head;
                t=head;
                head=head.next;
                t.next=null;
            }
            else
            {
                head=head.next;
            }
        }
        return d.next;
    }
}