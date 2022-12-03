class Solution {
    public String frequencySort(String s) {
        Map<String,Integer> countMap = new HashMap<>();
        for(char a : s.toCharArray()){
            countMap.put(String.valueOf(a),countMap.getOrDefault(String.valueOf(a),0)+1);
        }
        TreeMap<Integer,List<String>> sortCountMap = new TreeMap<>();
        for(String key : countMap.keySet()){
            List<String> countList = sortCountMap.getOrDefault(countMap.get(key),new LinkedList<>());
            StringBuilder repeatBuilder = new StringBuilder();
            for(int j = 0;j<countMap.get(key);j++){
                    repeatBuilder.append(key);
            }
             countList.add(repeatBuilder.toString());
            sortCountMap.put(countMap.get(key),countList);
            
        }
        StringBuilder result = new StringBuilder();
        for(int count : sortCountMap.descendingKeySet()){
            List<String> repeatList = sortCountMap.get(count);
            for(String repeatString : repeatList){
                result.append(repeatString);
            }
        }
        return result.toString();
        
    }
}
