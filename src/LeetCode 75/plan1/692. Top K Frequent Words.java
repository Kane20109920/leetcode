class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> wordCount = new HashMap<>();
        for(String word:words){
            wordCount.put(word,wordCount.getOrDefault(word,0)+1);
        }
        List<String> result = new ArrayList<>();
        PriorityQueue<String> wordOrder = new PriorityQueue<String>();
        wordCount.forEach((key, value) -> wordOrder.add(String.format("%03d%s", 500-value, key)));
        for (int i = 0; i < k; ++i) {
            result.add(wordOrder.poll().substring(3));
        }
        return result;
    }
}
