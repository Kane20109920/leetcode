/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head != null){
            Set<ListNode> nodeSet = new HashSet<>();
            ListNode root = head;
            while(root.next != null){
                if(nodeSet.contains(root)){
                    return root;
                }
                nodeSet.add(root);
                root = root.next;
            }    
        }
        
        return null;
        
    }
}
