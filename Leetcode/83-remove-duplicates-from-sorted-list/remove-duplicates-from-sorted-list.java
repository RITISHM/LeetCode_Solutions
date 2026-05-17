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
    public ListNode deleteDuplicates(ListNode head) {
         if (head==null || head.next==null)return head;
        ListNode newHead=new ListNode(-1);
        ListNode temp=newHead;
        ListNode curr=head;
        ListNode prev=null;
        while (curr!=null){
            ListNode next=curr.next;
            if (curr.next==null||next!=null&&curr.val!=next.val){
                temp.next=curr;
                temp=temp.next;
                while (curr.next!=null && curr.next.val==temp.val){
                    curr=curr.next;
                }

            }
           

            prev=curr;
            curr=curr.next;
        }
        temp.next=null;
        return newHead.next;
    }
}
