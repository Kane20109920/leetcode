class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        return checkIncrease(nums)||checkDecrease(nums);
    }
    public boolean checkIncrease(int[] nums){
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public boolean checkDecrease(int[] nums){
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                return false;
            }
        }
        return true;
    }
}
