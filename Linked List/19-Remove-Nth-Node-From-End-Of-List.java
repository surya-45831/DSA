// Problem Number: 19
// Problem Name: Remove Nth Node From End of List
// Time Complexity: O(n²)
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l=head;
        ListNode f=head;
        int c=1;
        while(f!=null&&f.next!=null)
        {
            c+=2;
            f=f.next.next;
        }
        if(f==null)
        {
            c--;
        }
        c=c-n+1;
        if(c==1)
        {
            return head.next;
        }
        int m=1;
        while(true)
        {
            m++;
            if(m==c)
            {
                l.next=l.next.next;
                return head;
            }
            else
            {
                l=l.next;
            }
        }
    }
}