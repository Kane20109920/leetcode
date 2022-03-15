class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length == 2){
            return true;
        }
        
        double x1 = coordinates[0][0];
        double y1 = coordinates[0][1];
        double x2 = coordinates[1][0];
        double y2 = coordinates[1][1];

        // Check for line that is parallel to y-axis
        boolean parallelY = true;
        for (int i = 2; i < coordinates.length; i++) {
            if (x2 - x1 == 0 && coordinates[i][0] - coordinates[i - 1][0] != 0) {
                parallelY = false;
            }
        }
        
        if (x2 - x1 == 0) return parallelY;
        
        // y = mx+b;
        double m = (y1-y2)/(x1-x2);

        double b = y1-(m*x1);
        for(int i = 2;i<coordinates.length;i++){
            int x3 = coordinates[i][0];
            int y3 = coordinates[i][1];
            
            if(y3 != m*x3+b){
                return false;
            }
        }
        return true;
    }
}
