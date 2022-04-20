class Solution {
    public int rob(int[] nums) {
        
        if(nums == null){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        int[] robStep = new int[nums.length];
        robStep[0] = nums[0];
        robStep[1] = Math.max(nums[0],nums[1]);
        for(int i = 2 ;i<robStep.length;i++){
            robStep[i] = Math.max(nums[i]+robStep[i-2],robStep[i-1]);
        }
        return robStep[robStep.length-1];
    }
}
