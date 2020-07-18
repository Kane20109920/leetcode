class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] tempStrings  = s.split(" ");
        for(int i = tempStrings.length-1; i>=0;i--){
            if(!tempStrings[i].equals("")){
                result.append(tempStrings[i]).append(" ");    
            }
            
        }
        while(result.toString().length() > 0 && String.valueOf(result.charAt(result.length()-1)).equals(" ")){
            result.deleteCharAt(result.length()-1);
        }
        return result.toString();
    }
}
