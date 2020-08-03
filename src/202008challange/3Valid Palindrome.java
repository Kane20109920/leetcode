class Solution {
    public boolean isPalindrome(String s) {
        if(Objects.isNull(s)){
            return true;
        }
        String tempS = s.toLowerCase();
        tempS = tempS.replaceAll("[^a-z0-9]","");
        if(tempS.length() == 0|| tempS.length() == 1){
            return true;
        }
        StringBuilder revTempS = new StringBuilder();
        boolean result = true;
        for(int i = 0;i<tempS.length()/2 && result;i++){
            result = result & tempS.charAt(i)==tempS.charAt(tempS.length()-i-1);
            // revTempS.append(String.valueOf(tempS.charAt(i)));
        }
        return result;
    }
}
