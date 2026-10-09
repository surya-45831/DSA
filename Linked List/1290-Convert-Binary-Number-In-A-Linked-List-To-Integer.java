// Problem Number: 1290
// Problem Name: Convert Binary Number in a Linked List to Integer
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
    public int getDecimalValue(ListNode head) {
        int s=0;
        while(head!=null)
        {
            s=s*2+head.val;
            head=head.next;
        }
        return s;

    }
}