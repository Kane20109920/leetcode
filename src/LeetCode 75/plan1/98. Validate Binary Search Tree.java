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
    public boolean isValidBST(TreeNode root) {
        List<Integer> orderList = new ArrayList<>();
        inOrder(root,orderList);
        for(int i = 0;i<orderList.size()-1;i++){
            if(orderList.get(i) >= orderList.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public void inOrder(TreeNode root,List<Integer> orderList){
        if(root != null){
            inOrder(root.left,orderList);
            orderList.add(root.val);
            inOrder(root.right,orderList);
        }
    }
}
