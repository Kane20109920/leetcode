class Solution {
    public int[] findBall(int[][] grid) {
        int[] result = new int[grid[0].length];
        for(int i = 0;i<result.length;i++){
            result[i] = checkFinish(grid,0,i);
        }
        return result;
    }
    private int checkFinish(int[][] grid,int row,int col){
        if(row >= grid.length){
            return col;
        }
        if(grid[row][col] == 1 && col == grid[row].length -1){
            return -1;
        }
        if(grid[row][col] == -1 && col == 0){
            return -1;
        }
        if(grid[row][col] == 1 && grid[row][col+1] == -1){
            return -1;
        }
        if(grid[row][col] == -1 && grid[row][col-1] == 1){
            return -1;
        }
        return checkFinish(grid,row+1,col+grid[row][col]);
        
    }
}
