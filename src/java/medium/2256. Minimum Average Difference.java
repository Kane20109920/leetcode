class Solution {
    public int minimumAverageDifference(int[] nums) {

        long leftSum = 0;
        long rightSum = 0;
        for(int num : nums){
            rightSum += num;
        }
        int minIndex = 0;
        int distance = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            leftSum += nums[i];
            rightSum -= nums[i];
            int tempDistance = Math.abs((int)(leftSum/(i+1)-rightSum/(rightSum == 0 ? 1:(nums.length- (i+1)))) );
            if(tempDistance == 0){
                return i;
            }
            if(tempDistance < distance){
                minIndex = i;
                distance = tempDistance;
            }
            
        }
        return minIndex;
    }
}
