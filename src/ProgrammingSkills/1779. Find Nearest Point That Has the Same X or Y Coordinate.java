class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDistance = Integer.MAX_VALUE;
        int result = -1;
        for(int i = 0;i<points.length;i++){
            int[] point = points[i];
            if(Math.abs(x-point[0]) == 0 || Math.abs(y-point[1]) == 0){
                int tempDistance = Math.abs(x-point[0]) + Math.abs(y-point[1]); 
                if(minDistance > tempDistance ){
                    minDistance = tempDistance;
                    result = i;
                }    
            }
            
        }
        return result;
    }
}
