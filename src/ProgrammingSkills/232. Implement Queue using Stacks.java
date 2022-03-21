class MyQueue {
    private  Stack<Integer> saveStack ;
    private  Stack<Integer> popStack ;
    public MyQueue() {
        this.saveStack = new Stack<Integer>();
        this.popStack = new Stack<Integer>();
    }
    
    public void push(int x) {
        saveStack.push(x);
    }
    
    public int pop() {
        if(popStack.isEmpty()){
            while(!saveStack.isEmpty()){
                popStack.push(saveStack.pop());
            }
        }
        return popStack.pop();
        
    }
    
    public int peek() {
        if(popStack.isEmpty()){
            while(!saveStack.isEmpty()){
                popStack.push(saveStack.pop());
            }
        }
        return popStack.peek();
    }
    
    public boolean empty() {
        return saveStack.isEmpty() && popStack.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
