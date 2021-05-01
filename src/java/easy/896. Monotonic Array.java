class Solution {
    public boolean isMonotonic(int[] A) {
        return checkInceas(A)|| checkDecreas(A);
    }
    public boolean checkInceas(int[] A){
        boolean result = true;
        for(int i = 0;result&&i<A.length-1;i++){
            // for(int j =i;result&&j<A.length;j++){
                result = result&(A[i]<=A[i+1]?true:false);
            // }
        }
        return result;
    }
    public boolean checkDecreas(int[] A){
        boolean result = true;
        for(int i = 0;result&&i<A.length-1;i++){
            // for(int j =i;result&&j<A.length;j++){
                result = result&(A[i]>=A[i+1]?true:false);
            // }
        }
        return result;
    }
}
