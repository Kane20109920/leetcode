class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] notTravel = new boolean[board.length][board[board.length-1].length];
        boolean getResult = false;
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                if(board[i][j] == word.charAt(0) && getResult == false){
                    getResult = travelWord(board,notTravel,0,word,i,j);
                }
            }
        }
        return getResult;
    }
    private boolean travelWord(char[][] board,boolean[][] notTravel,int charIndex,String word,int indexI,int indexJ){
        boolean result = false;
        if(indexI >= 0 && indexJ>=0 && indexI<board.length && indexJ<board[0].length && notTravel[indexI][indexJ] == false && charIndex < word.length()){
            // System.out.println(indexI+"\t"+indexJ+"\t"+board[indexI][indexJ]);
            if(word.charAt(charIndex) == board[indexI][indexJ]){
                if(charIndex == word.length() -1){
                    return true;
                }
                notTravel[indexI][indexJ] = true;
                result = travelWord(board,notTravel,charIndex+1,word,indexI-1,indexJ) || travelWord(board,notTravel,charIndex+1,word,indexI+1,indexJ) || travelWord(board,notTravel,charIndex+1,word,indexI,indexJ-1) || travelWord(board,notTravel,charIndex+1,word,indexI,indexJ+1);
                notTravel[indexI][indexJ] = false;
            }
        }
        return result;
    }
}
