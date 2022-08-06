class Solution {
    public long countBadPairs(int[] nums) {
        long result = ((long)nums.length*(nums.length-1))/2;
        int [] temp =  new int[nums.length];
        for(int i =0;i<nums.length;i++){
            temp[i] = nums[i]-i;
        }
        Map<Integer,Long> pairFreqMap = new HashMap<>();
        for(int num:temp){
            pairFreqMap.put(num,pairFreqMap.getOrDefault(num,0L)+1);
        }
        long goodPairs = 0;
        for(int key : pairFreqMap.keySet()){
            if(pairFreqMap.get(key) > 1){
                long value = pairFreqMap.get(key);
                goodPairs += value*(value-1)/2;
            }
        }
        return result-goodPairs;
        
    }
}
