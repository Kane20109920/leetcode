class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<>();
        int lengthOfRow = 1;
        for(int i = 0;i<numRows;i++){
            List<Integer> rowList = new LinkedList<>();
            for(int j = 0;j<lengthOfRow;j++){
                if(j == 0 || j == lengthOfRow-1){
                    rowList.add(1);
                }else{
                    rowList.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
            }
            result.add(rowList);
            lengthOfRow++;
            
        }
        return result;
    }
}
