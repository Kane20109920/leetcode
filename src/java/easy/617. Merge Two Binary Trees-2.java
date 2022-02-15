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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 != null || root2 != null){
            TreeNode result = new TreeNode(0);
            if(root1 != null && root2 != null){
                result.val = root1.val+root2.val;
                result.left = mergeTrees(root1.left,root2.left);
                result.right = mergeTrees(root1.right,root2.right);
            }else if(root1 != null){
                result.val = root1.val;
                result.left = mergeTrees(root1.left,null);
                result.right = mergeTrees(root1.right,null);
            }else{
                result.val = root2.val;
                result.left = mergeTrees(null,root2.left);
                result.right = mergeTrees(null,root2.right);
            }
            return result;
        }
        return  null;
        
        
    }
}
