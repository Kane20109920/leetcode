class Solution {
    Map<Integer, Integer> orangeDB = new HashMap<>();
    public int minDays(int n) {
        if(n<=1){
            return n;
        }
        if(!orangeDB.containsKey(n)){
            orangeDB.put(n,1+Math.min(n%2+minDays(n/2),n%3+minDays(n/3)));
        }
        return orangeDB.get(n);
    }

}
