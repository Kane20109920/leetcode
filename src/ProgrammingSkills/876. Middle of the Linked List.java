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
    public ListNode middleNode(ListNode head) {
        ListNode midNode = head;
        int count = 1;
        int mid = count/2;
        ListNode nextNode = head;
        while(nextNode != null && nextNode.next != null){
            nextNode = nextNode.next;
            count++;
            if(mid != count/2){
                midNode = midNode.next;
                mid = count/2;
            }
        }
        return midNode;
    }
}
