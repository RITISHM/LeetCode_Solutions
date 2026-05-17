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
        if (head==null||head.next==null)return head;
        int len=0;
        ListNode curr=head;
        while (len<k&&curr!=null){
            len++;
            curr=curr.next;
        }
        if (len <k){
            return head;
            // curr=head;
            // ListNode prev=null;
            // while (curr!=null){
            //     ListNode next=curr.next;
            //     curr.next=prev;
            //     prev=curr;
            //     curr=next;
            // }
            // return prev;
        }
        ListNode prev=reverseKGroup(curr,k);
        curr=head;
        for (int i=0;i<k;i++){
            ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
        }
        return prev;
    }
}