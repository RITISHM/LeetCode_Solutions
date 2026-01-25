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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head==null)return head;
        ListNode prev=head;
        for (int i=0;i<k;i++){
            if (prev==null)return head;
                prev=prev.next;
        }
        prev=reverseKGroup(prev,k);
        ListNode curr=head;
        for (int i=0;i<k;i++){
            ListNode n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;

        }
        return prev;
    }
}