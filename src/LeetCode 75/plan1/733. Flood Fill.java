class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int targetColor = image[sr][sc];
        boolean[][] filled = new boolean[image.length][image[sr].length];
        fillColor(image,filled,targetColor,newColor,sr,sc);
        return image;
    }
    public void fillColor(int[][] image,boolean[][] filled ,int target,int newColor,int i,int j){
        if( (0 <= i && i<image.length) && (0 <= j && j<image[i].length)){
            if(image[i][j] == target && filled[i][j] == false){
                image[i][j] = newColor;
                filled[i][j] = true;
                fillColor(image,filled,target,newColor,i-1,j);
                fillColor(image,filled,target,newColor,i+1,j);
                fillColor(image,filled,target,newColor,i,j-1);
                fillColor(image,filled,target,newColor,i,j+1);
            }
        }
        
    }
}
