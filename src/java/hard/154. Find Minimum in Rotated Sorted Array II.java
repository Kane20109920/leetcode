class Solution {
    public int findMin(int[] nums) {
        int resultIndex = 0;
        boolean getResult = false;
        for(int i = 1;i<nums.length && getResult== false;i++){
            if(nums[resultIndex]>nums[i]){
                resultIndex = i;
                getResult = true;
            }
        }
        return nums[resultIndex];
    }
}
