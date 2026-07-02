/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node curr = head;
        Node newHead = new Node(0);
        HashMap <Node,Node> map = new HashMap <>();
        Node newCurr = newHead;

        while(curr != null){
            Node newNode = new Node(curr.val);
            newCurr.next = newNode;
            newCurr = newCurr.next;
            map.put(curr, newNode);
            curr = curr.next;
        }

        for(Node i : map.keySet()){
            newCurr = map.get(i);
            if (newCurr!=null)
            if (i.random == null) newCurr.random = null;
            else newCurr.random = map.get(i.random);
        }
        
        return newHead.next;
    }
}