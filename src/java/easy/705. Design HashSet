class MyHashSet {
    int[] hashData;
    /** Initialize your data structure here. */
    public MyHashSet() {
         this.hashData = new int[1000000];
    }
    
    public void add(int key) {
        if(!contains(key)){
            this.hashData[key] = 1;
        }    
    }
    
    public void remove(int key) {
        this.hashData[key] = 0;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        boolean result = false;
        if(this.hashData[key] == 1){
            result = true;
        }
        return result;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
