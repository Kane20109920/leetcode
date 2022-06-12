class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        Map<Integer,Integer> costMap = new HashMap<>();
        int[] firstNodes = grid[0];
        for(int node:firstNodes){
            costMap.put(node,node);
        }
        
        for(int i = 1;i<grid.length;i++){
            List<Integer> preNodeList = new ArrayList<>();
            for(int j = 0;j<grid[i].length;j++){
                preNodeList.add(grid[i-1][j]);
            }
            for(int tempNodeIndex = 0 ;tempNodeIndex < grid[i].length;tempNodeIndex++){
                int tempNode = grid[i][tempNodeIndex];
                costMap.put(tempNode,Integer.MAX_VALUE);
                int preNode = preNodeList.get(0);
                
                for(int j = 1;j<preNodeList.size();j++){
                    int cost1 = costMap.get(preNode)+moveCost[preNode][tempNodeIndex]+tempNode;
                    int cost2 = costMap.get(preNodeList.get(j))+moveCost[preNodeList.get(j)][tempNodeIndex]+tempNode;
                    costMap.put(tempNode,Math.min(cost1,cost2));
                    preNode = preNodeList.get(j);
                }
            }
            
            
            
        }        
        return costMap.get(minNode);
    }
}
