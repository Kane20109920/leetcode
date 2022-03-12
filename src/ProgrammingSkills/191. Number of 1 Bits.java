public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int temp = n;
        int result = 0;
        for(int i = 0;i<32;i++){
            result += (temp&1);
            temp = temp >> 1;
        }
        
        return result;
    }
}
