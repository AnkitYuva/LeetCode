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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        ListNode old = head.next;
        int sum = 0;
        while(old != null){
            if(old.val != 0){
                sum += old.val;
            }else{
                curr.next = new ListNode(sum);
                curr = curr.next;
                sum = 0;
            }
            old = old.next;
        }
        return dummy.next;
    }
}