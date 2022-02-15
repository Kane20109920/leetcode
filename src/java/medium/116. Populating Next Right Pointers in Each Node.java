/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> levelQueue = new LinkedList<>();
        if(root != null){
            levelQueue.add(root);
            while(!levelQueue.isEmpty()){
                int levelSize = levelQueue.size();
                for(int i = 0;i<levelSize;i++){
                    Node next = levelQueue.poll();
                    if(i == levelSize -1){
                        next.next = null;
                    }
                    else{
                        next.next = levelQueue.peek();
                    }
                    if(next.left!=null){
                        levelQueue.add(next.left);
                    }
                    if(next.right!=null){
                        levelQueue.add(next.right);
                    }
                    
                }
        
            }
        }
        return root;
    }
}
