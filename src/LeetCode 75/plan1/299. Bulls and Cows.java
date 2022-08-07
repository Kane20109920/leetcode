class Solution {
    public String getHint(String secret, String guess) {
        Map<Character,Integer> secretIndex = new HashMap<>();
        Map<Character,Integer> guessIndex = new HashMap<>();
        char[] secretChars = secret.toCharArray();
        char[] guessChars = guess.toCharArray();
        int bullCount = 0;
        for(int i =0;i<secretChars.length;i++){
            if(secretChars[i] == guessChars[i]){
                bullCount++;
                continue;
            }
            secretIndex.put(secretChars[i],secretIndex.getOrDefault(secretChars[i],0)+1);
            guessIndex.put(guessChars[i],guessIndex.getOrDefault(guessChars[i],0)+1);
            
        }
        int cowCount = 0;
        for(char guessKey:guessIndex.keySet()){
            if(secretIndex.containsKey(guessKey)){
                cowCount+=Math.min(secretIndex.get(guessKey),guessIndex.get(guessKey));
            }
        }
        return bullCount+"A"+cowCount+"B";
        
    }
}
