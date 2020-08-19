class Solution {
    public String toGoatLatin(String S) {
        StringBuilder result = new StringBuilder();
        String[] tempS = S.split(" ");
        for(int i = 0;i<tempS.length;i++){
            String child = tempS[i];
            String childHead = String.valueOf(child.charAt(0));
            if(childHead.matches("[aeiouAEIOU]")){
                result.append(child);
            }
            else{
                result.append(child.substring(1));
                result.append(childHead);
                
            }
            result.append("ma");
            for(int j = i;j>=0;j--){
                result.append("a");
            }
            result.append(" ");
        }
        return result.deleteCharAt(result.length()-1).toString();
    }
}
