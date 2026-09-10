// Problem Number: 160
// Problem Name: Intersection of Two Linked Lists
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p=headA;
        ListNode l=headB;
        while(p!=l)
        {
            if(p==null)
            {
                p=headB;
            }
            else
            {
                p=p.next;
            }
            if(l==null)
            {
                l=headA;
            }
            else
            {
                l=l.next;
            }
        }
        return p;
    }
}