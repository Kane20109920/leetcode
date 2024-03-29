class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int tempSum = nums[left]+nums[right]+nums[i];
                if(tempSum == target){
                    return tempSum;
                }
                if(Math.abs(target - result) > Math.abs(target-tempSum)){
                    result = tempSum;
                }
                if(tempSum > target){
                    right--;
                }else{
                    left++;
                }    
            
            }
        }
        
        return result;
        
    }
}
