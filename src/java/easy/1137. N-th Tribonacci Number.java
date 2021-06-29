class Solution {
    public int tribonacci(int n) {
        if(n <= 2){
            return n == 0 ? 0:1;
        }
        int[] temp = new int[]{0,1,1};
        for(int i = 3;i<=n;i++){
            int sum = 0;
            for(int a:temp){
                sum+=a;
            }
            temp[0] = temp[1];
            temp[1] = temp[2];
            temp[2] = sum;
        }
        return temp[2];
        
    }
}
