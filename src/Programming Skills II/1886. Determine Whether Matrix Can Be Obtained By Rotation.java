class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int sum1 = 0,sum2=0;
        
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                sum1 += mat[i][j];
                sum2 += target[i][j];
            }
        }
        if(sum1 != sum2){
            return false;
        }
        int count = 0;
        boolean result = false;
        int[][] temp = clockwise(mat);
        while(count <= 4 && result == false){
            result = check(temp,target);
            temp = clockwise(temp);
            count++;
        }
        return result;
    }
    public boolean check(int[][] mat,int[][] target){
        boolean result = true;
        for(int i = 0;result&&i<mat.length;i++){
            for(int j = 0;result&&j<mat[i].length;j++){
                result = mat[i][j] == target[i][j];
            }   
        }
        return result;
    }
    public int[][] clockwise(int[][] mat){
        int[][] temp = new int[mat.length][mat[0].length];
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                 temp[j][mat.length-i-1] = mat[i][j];
            }   
        }
        return temp;
    }
    
}
