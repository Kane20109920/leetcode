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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        ListNode tempHead = head;
        StringBuilder target = new StringBuilder();
        while(tempHead != null){
            target.append(tempHead.val);
            tempHead = tempHead.next;
        }
        
        return inorder(target.toString(),"",root);
    }
    public boolean inorder(String target,String temp,TreeNode root){
        if(root != null){
            String now = temp+root.val;
            if(now.indexOf(target) != -1){
                return true;
            }
            return inorder(target,now,root.left)||inorder(target,now,root.right);
        }
        return false;
    }
}
