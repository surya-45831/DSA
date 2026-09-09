// Problem Number: 21
// Problem Name: Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode a=null;
        ListNode c=null;
        while(list1!=null&&list2!=null)
        {
            if(list1.val<list2.val)
            {
                if(a==null)
                {
                    a=new ListNode(list1.val);
                    c=a;
                }
                else
                {
                    ListNode t=new ListNode(list1.val);
                    c.next=t;
                    c=t;
                }
                list1=list1.next;
            }
            else
            {
                if(a==null)
                {
                    a=new ListNode(list2.val);
                    c=a;
                }
                else
                {
                    ListNode t=new ListNode(list2.val);
                    c.next=t;
                    c=t;
                }
                list2=list2.next;
            }
        }
        while(list1!=null)
        {
            if(a==null)
                {
                    a=new ListNode(list1.val);
                    c=a;
                }
                else
                {
                    ListNode t=new ListNode(list1.val);
                    c.next=t;
                    c=t;
                }
                list1=list1.next;
        }
        while(list2!=null)
        {
             if(a==null)
                {
                    a=new ListNode(list2.val);
                    c=a;
                }
                else
                {
                    ListNode t=new ListNode(list2.val);
                    c.next=t;
                    c=t;
                }
                list2=list2.next;
        }
        return a;
    }
}