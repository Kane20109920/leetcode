class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = (int)((long)start+(long)end)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]>target){
                end = mid-1;
            }
            
        }
        return nums[start]<target?start+1:start;
    }
}