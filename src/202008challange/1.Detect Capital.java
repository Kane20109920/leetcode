public class Solution {
    public boolean detectCapitalUse(String word) {
        boolean result = false;
        if(String.valueOf(word.charAt(0)).matches("[A-Z]")){
            if(word.length() == 1){
                return true;
            }
            if(String.valueOf(word.charAt(1)).matches("[A-Z]")){
                result = checkCapitalUse(word,"U");
            }
            else{
                result = checkCapitalUse(word,"L");
            }
        }
        else if(String.valueOf(word.charAt(0)).matches("[a-z]")){
            result = checkCapitalUse(word,"L");
        }

        return result;
    }
    public boolean checkCapitalUse(String word,String checkerTag){
        boolean tempResult = true;
            switch(checkerTag){
                case "U"  :
                    tempResult = word.substring(1).matches("[A-Z]*");
                    break;
                case "L" :
                    tempResult = word.substring(1).matches("[a-z]*");
                    break;
            }
        return tempResult;
    }
}
