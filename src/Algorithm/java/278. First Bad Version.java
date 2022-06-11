/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int end = n;
        int start = 1;
        while(start<end){
            long mid = ((long)start+(long)end)/2;
            boolean targetBoolean = isBadVersion((int)mid);
            if(targetBoolean){
                end = (int)mid;
            }else{
                start = (int)mid+1;
            }
            
        }
        return isBadVersion(start)?start:end;
        
    }
}
