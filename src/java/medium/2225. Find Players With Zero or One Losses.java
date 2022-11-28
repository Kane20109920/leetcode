class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Integer> loseCountMap = new HashMap<>();
        for(int[] match:matches){
            loseCountMap.put(match[1],loseCountMap.getOrDefault(match[1],0)+1);
        }
        TreeSet <Integer> winSet = new TreeSet<>();
        for(int[] match:matches){
            if(!loseCountMap.containsKey(match[0])){
                winSet.add(match[0]);
            }
        }
        List<Integer> loseOneList = new ArrayList<>();
        for(int key:loseCountMap.keySet()){
            if(loseCountMap.get(key) == 1){
                loseOneList.add(key);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        Collections.sort(loseOneList);
        result.add(new ArrayList<>(winSet));
        result.add(loseOneList);
        return result;
    }
}
