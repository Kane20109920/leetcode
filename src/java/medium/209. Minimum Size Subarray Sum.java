class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int sum = 0;
        while(end < nums.length){
            //找總和符合標準的window
            sum+=nums[end];

            //調整window大小
            while(sum >= target){
                result = Math.min(result,end-start+1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
