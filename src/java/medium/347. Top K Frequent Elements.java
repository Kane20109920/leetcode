class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        int[] resultValue = new int[k];
        Map<Integer,Integer> tempMap = new HashMap<>();
        TreeMap<Integer,List<Integer>> sortMap = new TreeMap<>();
        for(int i :nums){
            if(!tempMap.containsKey(i)){
                tempMap.put(i,1);
            }
            else{
                tempMap.put(i,tempMap.get(i)+1);
            }
        }
        for(int key:tempMap.keySet()){
            if(sortMap.get(tempMap.get(key)) == null){
                sortMap.put(tempMap.get(key),new ArrayList<Integer>());
            }
            sortMap.get(tempMap.get(key)).add(key);
        }       
        int count = 0;
        while(count < k){
            List<Integer> feqList = sortMap.get(sortMap.lastKey());
            for(int i = 0;i<feqList.size() && count<k;i++){
                result[count] = feqList.get(i);
                count++;
            }
            sortMap.remove(sortMap.lastKey());
        }
        return result;
    }
}
