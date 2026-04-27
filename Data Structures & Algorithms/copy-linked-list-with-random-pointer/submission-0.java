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
        HashMap<Node, Node> hm = new HashMap<>();
        Node temp = head;
        while(temp != null){
            Node n = new Node(temp.val);
            hm.put(temp, n);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            Node n = hm.get(temp);
            n.next = hm.get(temp.next);
            n.random = hm.get(temp.random);
            temp = temp.next;
        }
        return hm.get(head);
        
    }
}
