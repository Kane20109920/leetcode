class Solution {
    public int[] countBits(int n) {
        if(n == 0){
            return new int[1];
        }
        int[] result = new int[n+1];
        result[0] = 0;
        result[1] = 1;
        int lastPower = 0;
        for(int i = 2;i<result.length;i++){
            //2的n次方為1;
            if( (i&(i-1)) == 0){
                result[i] = 1;
                lastPower = i;
            }
            // 上次N次方+i-2^N位置資料值
            else{
                result[i] = result[lastPower]+result[i-lastPower];
            }
        }
        return result;
    }
}
