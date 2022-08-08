class Solution {
    //Top down
    public int minCostClimbingStairs(int[] cost) {
        Map<Integer,Integer> costMap = new HashMap<>();
        costMap.put(0,cost[0]);
        costMap.put(1,cost[1]);
        return Math.min(createCostMap(costMap,cost,cost.length-1),createCostMap(costMap,cost,cost.length-2));
    }
    public int createCostMap(Map<Integer,Integer> costMap,int[] cost,int index){
        if(costMap.containsKey(index)){
            return costMap.get(index);
        }else{
            costMap.put(index,cost[index]+Math.min(createCostMap(costMap,cost,index-1),createCostMap(costMap,cost,index-2)));
            return costMap.get(index);
        }
    }
}
