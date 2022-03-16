class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = Integer.MIN_VALUE;
        for(int i = 0 ;i<accounts.length;i++){
            int tempSum = 0;
            for(int amount:accounts[i]){
                tempSum += amount;
            }
            
            sum = tempSum > sum ? tempSum: sum;
        }
        return sum;
        
    }
}
