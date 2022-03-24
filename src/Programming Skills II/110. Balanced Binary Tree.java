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
    public boolean isBalanced(TreeNode root) {
        if(root != null){
            return isBalanced(root.left) && isBalanced(root.right) && Math.abs(getTreeHigh(root.left)-getTreeHigh(root.right)) <= 1;
        }
        return true;
    }
    public int getTreeHigh(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1+Math.max(getTreeHigh(root.left),getTreeHigh(root.right));
    }
}
