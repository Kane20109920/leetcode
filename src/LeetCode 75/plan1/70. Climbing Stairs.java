class Solution {
    //Top down
    Map<Integer,Integer> stepMap = new HashMap<>();
    public int climbStairs(int n) {
        if(stepMap.containsKey(n)){
            return stepMap.get(n);
        }else if(n == 0 || n==1){
            stepMap.put(n,1);
            return 1;
        }else{
            stepMap.put(n,climbStairs(n-1)+climbStairs(n-2));
            return stepMap.get(n);
        }
    }
}
