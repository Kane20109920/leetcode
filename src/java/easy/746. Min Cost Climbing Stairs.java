class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] resultArr = new int[cost.length];
        resultArr[0] = cost[0];
        resultArr[1] = cost[1];
        for(int i = 2;i<cost.length;i++){
            resultArr[i] = Math.min(resultArr[i-1],resultArr[i-2])+cost[i];
        }
        return Math.min(resultArr[resultArr.length-1],resultArr[resultArr.length-2]);
        // int result = Integer.MAX_VALUE;
        // result = Math.min(getStepCost(cost,0),getStepCost(cost,1));
        // return result;
    }
    // public int getStepCost(int[] cost,int index){
    //     if(index >= cost.length){
    //         return Integer.MAX_VALUE;
    //     }
    //     if( (index+1 == cost.length)||(index+2==cost.length)){
    //         return cost[index];
    //     }
    //     return cost[index]+Math.min(getStepCost(cost,index+1),getStepCost(cost,index+2));
    // }
}
