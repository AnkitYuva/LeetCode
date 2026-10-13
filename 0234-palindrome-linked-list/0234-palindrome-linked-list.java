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
    public boolean isPalindrome(ListNode head) {
        // List<Integer> list = new ArrayList<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     list.add(temp.val);
        //     temp=temp.next;
        // }
        // int low = 0;
        // int high = list.size()-1;
        // while(low<high){
        //     if(list.get(low)!=list.get(high)){
        //         return false;
        //     }
        //     low++;
        //     high--;
        // }
        // return true;


        // Stack<Integer> stack = new Stack();
        // ListNode temp = head;
        // while(temp != null){
        //     stack.push(temp.val);
        //     temp = temp.next;
        // }
        // temp = head;
        // while(temp != null){
        //     if(temp.val != stack.pop()){
        //         return false;
        //     }
        //     temp = temp.next;
        // }
        // return true;



        ListNode slow = head;
        ListNode fast = head;
        ListNode rev = null;
        while(fast != null && fast.next != null){
            ListNode temp = slow;
            slow = slow.next;
            fast = fast.next.next;
            temp.next = rev;
            rev = temp;
        }
        if(fast != null){
            slow = slow.next;
        }
        while(slow != null && slow.val == rev.val){
            slow = slow.next;
            rev = rev.next;
        }
        return slow == null;
    }
}