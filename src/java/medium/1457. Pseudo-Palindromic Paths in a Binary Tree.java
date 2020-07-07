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
    public int pseudoPalindromicPaths (TreeNode root) {
        int result = 0;
        Map<Integer,Integer> keyMap = new HashMap<>();
        for(int i = 1;i<10;i++){
            keyMap.put(i,0);
        }
        result = getPseudo(root,keyMap);
        return result;
    }
    public int getPseudo(TreeNode root,Map<Integer,Integer> keyMap){
        int result = 0;
        if(root != null){
            keyMap.put(root.val,keyMap.get(root.val)+1);
            result += getPseudo(root.left,keyMap);
            result += getPseudo(root.right,keyMap);
            if(Objects.isNull(root.left) && Objects.isNull(root.right)){
                if(checkHasPseudo(keyMap)){
                    result = 1;
                }
            }
            keyMap.put(root.val,keyMap.get(root.val)-1);
        }
        return result;
    }
    public boolean checkHasPseudo(Map<Integer,Integer> keyMap){
        int oddNum = 0;
        boolean canGetPseudo = true;
        for(int i =1;i<10;i++){
            if(keyMap.get(i) %2 == 1 ){
                oddNum++;
            }
        }
        if(oddNum >1){
            canGetPseudo = false;
        }
        return canGetPseudo;
    }
}
