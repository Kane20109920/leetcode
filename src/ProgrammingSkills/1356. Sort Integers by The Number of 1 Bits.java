class Solution {
    public int[] sortByBits(int[] arr) {
        TreeMap<Integer,TreeMap<Integer,Integer>> sortMap = new TreeMap<>();
        for(int num:arr){
            int count = 0;
            int target = num;
            for(int i = 0;i<32;i++){
                count += target&1;
                target = target >> 1;
            }
            TreeMap<Integer,Integer> subMap = sortMap.getOrDefault(count,new TreeMap<Integer,Integer>());
            subMap.put(num,subMap.getOrDefault(num,0)+1);
            sortMap.put(count,subMap);
        }
        int[] result = new int[arr.length];
        int start = 0;
        for(int mainKey :sortMap.keySet()){
            for(int subKey : sortMap.get(mainKey).keySet()){
                int repeatTime = sortMap.get(mainKey).get(subKey);
                for(int i = 0 ;i<repeatTime;i++){
                    result[start] = subKey;
                    start++;    
                }
                
            }
        }
        return result;
    }
}
