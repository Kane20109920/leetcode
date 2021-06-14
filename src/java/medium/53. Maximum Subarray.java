class Solution {
    public int maxSubArray(int[] nums) {
        int[] temp = new int[nums.length];
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            count += nums[i];
            temp[i] = Math.max(nums[i],count);
            count = temp[i];
        }
        int result = temp[0];
        for(int i:temp){
            if(result < i){
                result = i;
            }
        }
        return result;
            
    }
}
