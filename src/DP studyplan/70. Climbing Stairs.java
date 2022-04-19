class Solution {
    //button up
    List<Integer> stepList = new ArrayList<>();
    public int climbStairs(int n) {
        if(n<stepList.size()){
            return stepList.get(n);
        }
        int start = stepList.size();
        for(int i = start;i<=n;i++){
            if(i == 0){
                stepList.add(0);
            }else if(i == 1){
                stepList.add(1);
            }else if(i == 2){
                stepList.add(2);
            }else{
                stepList.add(stepList.get(i-1)+stepList.get(i-2));
            }
        }
        return stepList.get(n);
    }
}
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
