class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int start = 0,end = mat[0].length-1;
        for(int i = 0;i<mat.length;i++){
            sum += mat[i][start]+mat[i][end];
            if(start == end){
                sum -= mat[i][start];
            }
            start += 1;
            end -= 1;
        }
        return sum;
    }
}
