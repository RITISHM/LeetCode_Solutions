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
    public ListNode reverseFrom(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while (curr!=null){
            ListNode n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if (head==null||head.next==null)return true ;
        ListNode slow=head;
        ListNode fast=head;

        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow=reverseFrom(slow);
        while (slow!=null){
            if (slow.val!=head.val)return false ;
            slow=slow.next;
            head=head.next;
        }
        return true;
    }
}