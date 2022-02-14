class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i =0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j] == 1){
                    max = Math.max(max,calculatorIsland(grid,i,j));
                }
            }
            
        }
        return max;
    }
    public int calculatorIsland(int[][] grid,int i,int j){
        if( (0<=i&&i<grid.length )&& (0<=j&&j<grid[i].length)){
            if(grid[i][j] == 1){
                grid[i][j] = 2;
                return 1+calculatorIsland(grid,i+1,j)+calculatorIsland(grid,i-1,j)+calculatorIsland(grid,i,j+1)+calculatorIsland(grid,i,j-1);
            }
            
        }
        return 0;
        
    }
}
