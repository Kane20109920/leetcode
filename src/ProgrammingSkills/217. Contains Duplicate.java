class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Boolean> containMap = new HashMap<>();
        for(int num:nums){
            if(containMap.containsKey(num)){
                return true;
            }
            containMap.put(num,true);
        }
        return false;
    }
}
