class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int result = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j] == '1' && visited[i][j] == false){
                    result++;
                    setVisited(grid,visited,i,j);
                }
            }
        }
        return result;
    }
    private  void setVisited(char[][] grid,boolean[][] visited,int i,int j){
        if(i >= 0 && j >=0 && i<grid.length&&j<grid[i].length){
            if(grid[i][j] == '1' && visited[i][j] == false){
                visited[i][j] = true;
                setVisited(grid,visited,i+1,j);
                setVisited(grid,visited,i-1,j);
                setVisited(grid,visited,i,j+1);
                setVisited(grid,visited,i,j-1);
            }
        }
    }
}
