class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        TreeMap<Integer,Integer> temperMap= new TreeMap<>();
        int[] result = new int[temperatures.length];
        for(int i = temperatures.length-1;i>=0;i--){
            temperMap.put(temperatures[i],i);
            Integer highKey = temperMap.higherKey(temperatures[i]);
            int minDiff = Integer.MAX_VALUE;
            while(highKey != null){
                int index = temperMap.get(highKey);
                int tempDiff = index-i;
                if((tempDiff)>0 && tempDiff<minDiff){
                    minDiff = tempDiff;
                }
                highKey = temperMap.higherKey(highKey);
            }
            result[i] = minDiff == Integer.MAX_VALUE?0:minDiff;
            
        }
        return result;
        
    }
}
