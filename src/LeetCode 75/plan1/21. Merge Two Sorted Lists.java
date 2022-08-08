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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode pre = head;
        ListNode next1 = list1;
        ListNode next2 = list2;
        while(next1 != null && next2 != null){
            if(next1.val<next2.val){
                pre.next = next1;
                next1 = next1.next;
            }else{
                pre.next = next2;
                next2 = next2.next;
            }
            pre = pre.next;
        }
        if(next1 != null){
            pre.next = next1;
        }
        else if(next2 != null){
            pre.next = next2;
        }
        return head.next;
    }
}
