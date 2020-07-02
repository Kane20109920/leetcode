class Solution {
    public int minAddToMakeValid(String S) {
        Stack<String> temp = new Stack<String>();
        for(int i = 0;i< S.length();i++){
            String tags = String.valueOf(S.charAt(i));
            if(tags.equals("(")){
                temp.push(tags);
            }
            else{
                if(temp.size() == 0){
                    temp.push(tags);
                }
                else{
                    String tempPair = temp.pop();    
                    if(!tempPair.equals("(")){
                        temp.push(tempPair);
                        temp.push(tags);
                    }
                }
                                
            }   
        }
        return temp.size();
    }
}
