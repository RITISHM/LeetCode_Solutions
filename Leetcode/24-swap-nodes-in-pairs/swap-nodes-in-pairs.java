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
    public ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null)return head;
        ListNode right=head;
        for (int i=0;i<2;i++){
            right=right.next;
        }
        ListNode prev=swapPairs(right);
        ListNode curr=head;
        ListNode next=head.next;
        next.next=curr;
        curr.next=prev;
        return next;


    }
}