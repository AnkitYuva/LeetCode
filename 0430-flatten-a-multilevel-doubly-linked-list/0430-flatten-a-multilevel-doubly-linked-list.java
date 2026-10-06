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
    // List<Node> list = new ArrayList<>();
    public Node flatten(Node head) {
    //     if(head == null){
    //         return null;
    //     }
    //     dfs(head);
    //     Node dummy = new Node(0);
    //     Node temp = dummy;
    //     for(Node node : list){
    //         temp.next = node;
    //         node.prev = temp;
    //         node.child = null;
    //         temp = node;
    //     }
    //     dummy = dummy.next;
    //     dummy.prev = null;
    //     return dummy;
    // }
    // public void dfs(Node node){
    //     if(node == null){
    //         return;
    //     }
    //     list.add(node);
    //     dfs(node.child);
    //     dfs(node.next);

        if(head == null){
            return head;
        }
        Node temp = head;
        while(temp != null){
            if(temp.child != null){
                Node next2 = temp.next;
                temp.next = flatten(temp.child);
                temp.next.prev = temp;
                temp.child = null;
            while(temp.next != null){
                temp = temp.next;
            }
            if(next2 != null){
                temp.next = next2;
                next2.prev = temp;
                }
            }
            temp = temp.next;
        }
        return head;
    }
}