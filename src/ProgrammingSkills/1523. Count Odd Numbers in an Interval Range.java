class Solution {
    public int countOdds(int low, int high) {

        if( (high-low+1)%2 == 0 ){
            return (high-low+1)/2;
        }else{
            int tempLow = low % 2 == 0?low+1:low;
            int tempHigh = high %2 == 0? high-1:high;
            return (tempHigh-tempLow)/2+1;
            
        }
    }
}
