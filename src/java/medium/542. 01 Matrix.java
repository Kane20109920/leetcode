class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] result = new int[mat.length][mat[0].length];
        for(int i = 0;i<mat.length;i++){
            for(int j =0;j<mat[i].length;j++){
                if(result[i][j] == 0){
                    result[i][j] = calculate(result,mat,i,j);    
                }
                System.out.println("-----------------------");
            }
        }
        return result;
    }
    public int calculate(int[][] result,int[][] mat,int i,int j){
        if(i >= 0 && i<mat.length && j>= 0 && j<mat[i].length){
            // if(result[i][j] == -1){
            //     return 10000;
            // }
            if(mat[i][j] == 0){
                return 0;
            }
            if(result[i][j] > 0){
                return result[i][j];
            }

            int temp = result[i][j];
            result[i][j] = 10000;
            int result1 = calculate(result,mat,i-1,j);
            int result4 = calculate(result,mat,i,j-1);
            int result3 = calculate(result,mat,i,j+1);
            int result2 = calculate(result,mat,i+1,j);
            result[i][j] = temp;
            
            
            // result[i][j] = 1+Math.min(Math.min(Math.min(result1,result2),result3),result4);

            System.out.println(i+"\t"+j+"\t"+result1+"\t"+result2+"\t"+result3+"\t"+result4+"\t"+result[i][j]);
            return 1+Math.min(Math.min(Math.min(result1,result2),result3),result4);
        }
        return 10000;
    }
}
