/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        createList(result,1,root);
        return result;
    }
    public void createList(List<List<Integer>> result,int level,Node root){
        if(root != null){
            List<Integer> levelList = result.size()<level ? new LinkedList<Integer>():result.get(level-1);
            if(levelList.isEmpty()){
                result.add(levelList);
            }
            levelList.add(root.val);
            for(Node child:root.children){
                createList(result,level+1,child);
            }
            
        }
        
        
        
        
    }
}
