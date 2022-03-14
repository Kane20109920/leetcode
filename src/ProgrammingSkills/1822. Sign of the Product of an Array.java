class Solution {
    public int arraySign(int[] nums) {
        int negative = 0;
        for(int num:nums){
            if(num < 0){
                negative += 1;
                negative = negative % 2;
            }
            if(num == 0){
                return 0;
            }
        }
        return negative == 0 ?1:-1;
    }
}
