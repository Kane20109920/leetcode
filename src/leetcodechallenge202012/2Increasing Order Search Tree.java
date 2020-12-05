class Solution {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode result =new TreeNode(-1);
        inorder(root,result);
        return result.right;
    }
    public void inorder(TreeNode source,TreeNode curNode){
        if(source != null){
            inorder(source.left,curNode);
            TreeNode temp = new TreeNode(source.val);
            TreeNode child = curNode;
            while(child.right != null){
                child = child.right;
            }
            child.right = temp;
        
            inorder(source.right,curNode);
        }
    }
    
}
