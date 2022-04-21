/**
*開一個arrayr紀錄是否能走到該位置，由後面往前算
*如果有個必經的點為false，則其他皆為false
*/
class Solution {
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }
        boolean[] dp = new boolean[nums.length];
        dp[dp.length-1] = true;
        for(int i = dp.length-2;i>=0;i--){
            int maxStep = nums[i];
            for(int j = 1;j<=maxStep;j++){
                if(i+j <nums.length && dp[i+j]){
                    dp[i] = true;
                    
                }
            }
        }
        return dp[0];
    }
}
