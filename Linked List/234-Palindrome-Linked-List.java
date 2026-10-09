// Problem Number: 234
// Problem Name: Palindrome Linked List
// Time Complexity: O(n³)
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
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
        {
            return true;
        }
        ListNode h=head;
        ListNode l=head;
        while(h!=null&&h.next!=null)
        {
            l=l.next;
            h=h.next.next;
        }
        if(h!=null)
        {
            l=l.next;
        }
        ListNode pre=null;
        while(l!=null)
        {
            ListNode t=l;
            l=l.next;
            t.next=pre;
            pre=t;
        }
        while(pre!=null)
        {
            if(head.val!=pre.val)
            {
                return false;
            }
            pre=pre.next;
            head=head.next;
        }
        return true;

    }
}