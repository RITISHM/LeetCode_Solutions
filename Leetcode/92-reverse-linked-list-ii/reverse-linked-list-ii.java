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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next==null||left==right)return head;
        ListNode leftNode=null;
        ListNode rightNode=null;
        ListNode prevleft=null;
        ListNode curr=head;
        ListNode prev=null;
        int count =1;
        while(leftNode==null||rightNode==null){
            
            if (count==left){//finding the left node 
                leftNode =curr;
                prevleft=prev;
            }
            if (count==right){// finding the right node 
                rightNode=curr;
            }
            count ++;
            prev=curr;
            curr=curr.next;

        }

        //reverse form the left to right
        curr=leftNode;
        ListNode nextright=rightNode.next;
        prev=nextright;
        // until we dont encounter the node which is out of renge
        while (curr!=nextright){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //if left is at head
        if (prevleft==null)return prev;
        
        //attach the prev to the node which was before left 
        prevleft.next=prev;
        return head;

    }
}