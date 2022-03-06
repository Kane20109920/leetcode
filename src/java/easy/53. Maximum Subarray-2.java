class Solution {
    public int maxSubArray(int[] nums) {
        int[] temp = new int[nums.length];
        int tempMax = 0;//計算到這邊的最大值
        for(int i = 0;i<nums.length;i++){
            tempMax += nums[i];
            temp[i] = Math.max(nums[i],tempMax);//判段拿到現在VS現在從頭拿，哪個比較好
            tempMax = temp[i];
        }
        int result = temp[0];

        for(int t:temp){
            result = Math.max(result,t);
        }
        
        return result;
    }
}
