/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    List<Node> list = new ArrayList<>();
    public Node flatten(Node head) {
        if(head == null){
            return null;
        }
        dfs(head);
        Node dummy = new Node(0);
        Node temp = dummy;
        for(Node node : list){
            temp.next = node;
            node.prev = temp;
            node.child = null;
            temp = node;
        }
        dummy = dummy.next;
        dummy.prev = null;
        return dummy;
    }
    public void dfs(Node node){
        if(node == null){
            return;
        }
        list.add(node);
        dfs(node.child);
        dfs(node.next);
    }
}