class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new LinkedList<>();
        boolean[][] trivalMap = new boolean[matrix.length][matrix[0].length];
        createPath(result,matrix,trivalMap,0,0,1);
        return result;
    }
    public void createPath(List<Integer> list,int[][] matrix,boolean[][] trivalMap,int i,int j,int trigger){
        if(i<matrix.length&&j<matrix[0].length&&i>=0&&j>=0){
            if(!trivalMap[i][j]){
                list.add(matrix[i][j]);
                trivalMap[i][j] = true;
                switch(trigger){
                    case 1:
                        createPath(list,matrix,trivalMap,i,j+1,1);
                        createPath(list,matrix,trivalMap,i+1,j,2);
                        createPath(list,matrix,trivalMap,i,j-1,3);
                        createPath(list,matrix,trivalMap,i-1,j,4);
                    break;
                    case 2:
                        createPath(list,matrix,trivalMap,i+1,j,2);
                        createPath(list,matrix,trivalMap,i,j-1,3);
                        createPath(list,matrix,trivalMap,i-1,j,4);
                        createPath(list,matrix,trivalMap,i,j+1,1);
                    break;
                    case 3:
                        createPath(list,matrix,trivalMap,i,j-1,3);
                        createPath(list,matrix,trivalMap,i-1,j,4);
                        createPath(list,matrix,trivalMap,i,j+1,1);
                        createPath(list,matrix,trivalMap,i+1,j,2);
                    break;
                    case 4:
                        createPath(list,matrix,trivalMap,i-1,j,4);
                        createPath(list,matrix,trivalMap,i,j+1,1);
                        createPath(list,matrix,trivalMap,i+1,j,2);
                        createPath(list,matrix,trivalMap,i,j-1,3);
                        
                    break;
                }
                
            }
        }
    }
}
