class Solution {
    public int numSub(String s) {
        long result= 0;
        int startIndex = s.indexOf("1");
        int endIndex = s.indexOf("0",startIndex);
        int modMax = (int)Math.pow(10, 9) + 7;
        while(startIndex != -1){
            if(endIndex == -1){
                endIndex = s.length();
            }
            long len = endIndex-startIndex;
            result += ((len*(len+1))/2)%modMax;
            startIndex = s.indexOf("1",endIndex);
            endIndex = s.indexOf("0",startIndex+1);
        }
        return (int)result;
    }
}
