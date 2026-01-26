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
 import java.util.Stack;
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head==null||head.next==null)return true ;
        ListNode slow=head;
        ListNode fast=head;
        Stack<Integer> st=new Stack<>();
        while (fast!=null&&fast.next!=null){
            st.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        if (fast!=null)slow=slow.next;
        while (slow!=null ){
            System.out.println("slow"+slow.val+" st"+st.peek());
            if (slow.val!=st.pop())return false ;
            slow=slow.next;
        }
        return true ;       
    }
}