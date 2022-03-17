class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r * c){
            return mat;
        }
        int[][] result = new int[r][c];
        int rIndex = 0;
        int cIndex = 0;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                result[rIndex][cIndex] = mat[i][j];
                cIndex = (cIndex+1)%c;
                rIndex = cIndex == 0 ? rIndex+1:rIndex;
                
            }
        }
        return result;
    }
}
