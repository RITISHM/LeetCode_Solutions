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
    
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        int size=0;
        ListNode tail=head;
        ListNode start=head;
    
        while (tail.next!=null){
            size++;
            tail=tail.next;
        }
        size++;
        k=k%size;
        if(k==0){
            return head;
        }
        tail.next=head;

        
        for(int i=1;i<size-k;i++){
            start=start.next;
        }
        head=start.next;
        start.next=null;
        return head;
    }
}