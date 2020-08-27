public class Solution {
    public int removeDuplicates(int[] nums) {
        int min = Integer.MIN_VALUE;
        int result = 0;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(min != nums[i]){
                min = nums[i];
                result++;
            }
            else{
                nums[i] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(nums);
            
        return result;
    }
}
