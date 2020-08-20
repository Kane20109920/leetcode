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
    public void reorderList(ListNode head) {
        if(Objects.isNull(head)||Objects.isNull(head.next)){
            return;
        }
        int listCount = 0;
        ListNode tempHead = head;
        while(!Objects.isNull(tempHead)){
            listCount++;
            tempHead = tempHead.next;
        }
        tempHead = head;
        ListNode middleNode = head;
        int current = 0;
        boolean jump = false;
        while(jump == false){
            current++;
            if(current == listCount/2){
                middleNode = tempHead;
                ListNode preMiddle=tempHead;
                ListNode preCurrent=tempHead.next;
                while(preCurrent.next!=null){
                    ListNode currentNode=preCurrent.next;
                    preCurrent.next=currentNode.next;
                    currentNode.next=preMiddle.next;
                    preMiddle.next=currentNode;
                }
                    jump = true;
            }
            tempHead = tempHead.next;
            
        }
        tempHead = head;
        ListNode tempMiddle = middleNode.next;
        while(tempHead != middleNode){
            middleNode.next=tempMiddle.next;
            tempMiddle.next=tempHead.next;
            tempHead.next=tempMiddle;
            tempHead=tempMiddle.next;
            tempMiddle=middleNode.next;

        }
        // return head;
    }

}
