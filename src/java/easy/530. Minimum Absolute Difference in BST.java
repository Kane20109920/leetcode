/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    List<Integer> values = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        int result = Integer.MAX_VALUE;;
        dfs(root);
        for(int i = 0;i<values.size()-1;i++){
            if(result > Math.abs(values.get(i)-values.get(i+1))){
                result = Math.abs(values.get(i)-values.get(i+1));
            }
        }
        return result;
    }
    public void dfs(TreeNode root){
        if(root != null){
            dfs(root.left);
            values.add(root.val);
            dfs(root.right);
        }
    }
}
