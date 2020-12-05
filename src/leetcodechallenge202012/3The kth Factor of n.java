class Solution {
    public int kthFactor(int n, int k) {
        int result = -1;
        int count =0;
        if(n==1 && k==1){
            return 1;
        }
        for(int i = 1;i<=n && result == -1;i++){
            if(n % i == 0){
                count++;
                if(count==k){
                    result = i;
                }
            }
        }
        return result;
    }
}
