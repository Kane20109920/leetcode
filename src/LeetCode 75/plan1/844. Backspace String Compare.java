class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        for(char temp:s.toCharArray()){
            if(temp == '#' && !sStack.isEmpty()){
                sStack.pop();
            }
            if(temp != '#'){
                sStack.push(temp);
            }
        }
        for(char temp:t.toCharArray()){
            if(temp == '#' && !tStack.isEmpty()){
                tStack.pop();
            }
            if(temp != '#'){
                tStack.push(temp);
            }
        }
        if(sStack.size() == tStack.size()){
            boolean result = true;
            while(!sStack.isEmpty() && result){
                result = sStack.pop() == tStack.pop();
            }
            return result;
        }
        return false;
        
    }
}
