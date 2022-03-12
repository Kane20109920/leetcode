class Solution {
    public int subtractProductAndSum(int n) {
        int temp = n;
        int digits = 1;
        int sum = 0;
        while(temp > 0){
            digits *= temp%10;
            sum += temp%10;
            temp = temp/10;
        }
        return digits-sum;
    }
}
