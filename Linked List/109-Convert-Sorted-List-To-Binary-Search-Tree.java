// Problem Number: 109
// Problem Name: Convert Sorted List to Binary Search Tree
// Difficulty: Medium
// Topic: Linked List, Divide and Conquer, Tree, Binary Search Tree, Binary Tree

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int end = 0;
        ListNode h = head;
        while(h!=null) {
            end++;
            h = h.next;
        }
        return helper(head,0,end);
    }
    public TreeNode helper(ListNode head, int start, int end) {
        if(start>end) {
            return null;
        }
        int mid = (start+end)/2;
        TreeNode l = helper(head,start, mid-1);
        TreeNode p = new TreeNode(head.val);
        p.left = l;
        head = head.next;
        TreeNode r = helper(head,mid+1,end);
        return p;
    }
}