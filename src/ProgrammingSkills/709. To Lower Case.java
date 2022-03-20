class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if( c >= 65 && c <= 90){
                c += (char) 32;
            }
            result.append(String.valueOf(c));
        }
        return result.toString();
    }
}
