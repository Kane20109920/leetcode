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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        else{
            ListNode nextNode = head.next;
            ListNode now = head;
            ListNode pre = null;
            while(nextNode != null){
                now.next = pre;
                pre = now;
                now = nextNode;
                nextNode = nextNode.next;
                
            }
            now.next = pre;
            return now;
                
        }
        
    }
}
