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
    public void reorderList(ListNode head) {
        ListNode middle=head;
        ListNode last=head;
        while (last.next!=null &&last.next.next!=null){
            middle =middle.next;
            last=last.next.next;
        }
        ListNode smiddle=middle.next;
        middle.next=null;

        ListNode prev=null;
        while (smiddle!=null){
            ListNode next=smiddle.next;
            smiddle.next=prev;
            prev=smiddle;
            smiddle=next;
        }
        smiddle=prev;
        ListNode newHead=new ListNode();
        ListNode curr=newHead;
        while (head!=null ){
            curr.next=head;
            curr=curr.next;
            head=head.next;
            if(smiddle!=null){
            curr.next=smiddle;
            curr=curr.next;
            smiddle=smiddle.next;
            }
        }

        
    }
}