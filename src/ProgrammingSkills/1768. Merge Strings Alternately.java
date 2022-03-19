class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int w1Index =0;
        int w2Index = 0;
        int length = Math.max(word1.length(),word2.length());
        for(int i = 0;i<length;i++){
            if(w1Index<word1.length()){
                result.append(word1.charAt(w1Index));
                w1Index++;
            }if(w2Index <word2.length()){
                result.append(word2.charAt(w2Index));
                w2Index++;
            }
            
        }
        return result.toString();
    }
}
