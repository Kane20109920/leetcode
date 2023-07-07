class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int maxFreq = 0;
        int left = 0;
        int right = 0;
        Map<Character,Integer> freqMap = new HashMap<>();
        while(right < answerKey.length()){
            char key = answerKey.charAt(right);
            freqMap.put(key,freqMap.getOrDefault(key,0)+1);
            maxFreq = Math.max(maxFreq,freqMap.get(key));
            if(right-left+1 > maxFreq+k){
                freqMap.put(answerKey.charAt(left),freqMap.get(answerKey.charAt(left))-1);
                left++;
            }
            right++;
        }
        return answerKey.length()-left;
    }
}
