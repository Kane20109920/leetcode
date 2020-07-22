/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrder(result,0,root);
        return result;
    }
    public void levelOrder(List<List<Integer>> result,int level ,TreeNode root){
        if(root != null){
            List<Integer> levelResult;
            if(level >= result.size()){
                levelResult = new ArrayList<Integer>();
                result.add(levelResult);
            }
            levelResult = result.get(level);
            levelResult.add( level%2==0?levelResult.size():0,root.val);
            levelOrder(result,level+1,root.left);
            levelOrder(result,level+1,root.right);
        }
        
    }
}
