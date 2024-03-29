class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
            }
            start = nums[mid]<target?mid+1:start;
            end = nums[mid]>target?mid:end;
        }
        return nums[start]==target?start:-1;
    }
}
