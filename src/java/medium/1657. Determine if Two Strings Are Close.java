class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int[] word1Feq = new int[26];
        int[] word2Feq = new int[26];
        for(int i = 0;i<word1.length();i++){
            word1Feq[word1.charAt(i)-'a']++;
            word2Feq[word2.charAt(i)-'a']++;
        }
        for(int i = 0;i<26;i++){
            if(word1Feq[i] == 0 && word2Feq[i] != 0){
                return false;
            }
        }
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int i = 0;i<26;i++){
            countMap.put(word1Feq[i],countMap.getOrDefault(word1Feq[i],0)+1);
            countMap.put(word2Feq[i],countMap.getOrDefault(word2Feq[i],0)-1);
        }
        for(int key:countMap.keySet()){
            if(countMap.get(key) != 0){
                return false;
            }
        }
        return true;
    }
}
