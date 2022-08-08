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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        getLevel(0,root,result);
        return result;
    }
    private void getLevel(int level,TreeNode root,List<List<Integer>> result){
        if(root != null){
            if(level >= result.size()){
                List<Integer> temp = new LinkedList<>();
                temp.add(root.val);
                result.add(temp);
            }else{
                List<Integer> temp = result.get(level);
                temp.add(root.val);
                result.set(level,temp);
            }
            getLevel(level+1,root.left,result);
            getLevel(level+1,root.right,result);
        }
    }
}
