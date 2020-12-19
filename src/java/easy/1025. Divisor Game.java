class Solution {
    Map<Integer,Boolean> resultMap = new HashMap<>();
    public boolean divisorGame(int N) {
        boolean result = false;
        if(resultMap.get(N) != null){
            result = resultMap.get(N);
        }
        else{
            for(int i =1;i<N && result == false;i++){
                if(N%i == 0 && !divisorGame(N - i)){
                    result = true;
                    break;
                }
            }
            resultMap.put(N,result);
        }
        return result;
    }
}
