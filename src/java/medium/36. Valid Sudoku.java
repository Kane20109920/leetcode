class Solution {
    public boolean isValidSudoku(char[][] board) {
        return checkCol(board) && checkRow(board) && checkBlock(board);
    }
    private boolean checkCol(char[][] board){
        for(int col = 0;col < 9;col++){
            HashSet<Character> checkSet = new HashSet<>();
            for(int i = 0;i< 9;i++){
                if(board[col][i] != '.'){
                    if(checkSet.contains(board[col][i])){
                        // System.out.println("checkCol fail\t"+col+"\t"+i+"\t"+board[col][i]);
                        return false;
                    }
                    checkSet.add(board[col][i]);
                }
            }    
        }
        
        return true;
    }
    private boolean checkRow(char[][] board){
        for(int row = 0;row<9;row++){
            HashSet<Character> checkSet = new HashSet<>();
            for(int i = 0;i< 9;i++){
                if(board[i][row] != '.'){
                    if(checkSet.contains(board[i][row])){
                        // System.out.println("checkRow fail\t"+i+"\t"+row+"\t");
                        return false;
                    }
                    checkSet.add(board[i][row]);
                }
            }    
        }
        
        return true;
    }
    private boolean checkBlock(char[][] board){
        for(int blockI = 0;blockI<3;blockI++){
            for(int blockJ = 0;blockJ<3;blockJ++){
                HashSet<Character> checkSet = new HashSet<>();
                for(int i = blockI*3;i<(blockI+1)*3;i++){
                    for(int j = blockJ*3;j<(blockJ+1)*3;j++){
                        if(board[i][j] != '.'){
                            if(checkSet.contains(board[i][j])){
                                // System.out.println("checkBlock fail\t"+i+"\t"+j+"\t");
                                return false;
                            }
                            checkSet.add(board[i][j]);
                        }
                    }
                }
            }
        }
        return true;
        
    }
}
