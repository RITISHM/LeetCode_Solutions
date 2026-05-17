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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0)return null;
        if (lists.length==1)return lists[0];
        ListNode curr1=lists[0];
        for (int i=1;i<lists.length;i++){
            ListNode dummy=new ListNode(-1);
            ListNode curr=dummy;
            ListNode curr2=lists[i];
            while (curr1!=null && curr2!=null){
                if (curr1.val<curr2.val){
                    curr.next=curr1;
                    curr1=curr1.next;
                    curr=curr.next;
                }
                else{
                curr.next=curr2;
                curr2=curr2.next;
                curr=curr.next;
                }
            }
            if (curr2==null)curr.next=curr1;
            if (curr1==null)curr.next=curr2;
            curr1=dummy.next;
        }
        return curr1;
        
    }
}