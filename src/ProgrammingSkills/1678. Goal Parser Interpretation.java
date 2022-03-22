class Solution {
    public String interpret(String command) {
        
        StringBuilder result = new StringBuilder();
        int start = 0;
        while(start<command.length()){
            if(command.charAt(start) == 'G'){
                result.append("G");
                start += 1;
            }
            else{
                if(command.charAt(start+1) == ')'){
                    result.append("o");
                    start += 2;
                }else{
                    result.append("al");
                    start += 4;
                }
            }
        }
        
        return result.toString();
    }
}
