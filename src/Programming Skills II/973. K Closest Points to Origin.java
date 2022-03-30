class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        TreeMap<Integer,List<List<Integer>>> distMap = new TreeMap<>();
        for(int[] point:points){
            int x = point[0];
            int y = point[1];
            int dist =(int) Math.pow(x,2)+ (int)Math.pow(y,2);
            List<List<Integer>> pointList = distMap.getOrDefault(dist,new LinkedList<>());
            List<Integer> tempList = new LinkedList<>();
            tempList.add(x);
            tempList.add(y);
            pointList.add(tempList);
            distMap.put(dist,pointList);
        }
        int count = 0;
        for(int dist:distMap.keySet()){
            
            List<List<Integer>> list = distMap.get(dist);
            for(List<Integer> resuls :list){
                if(count < k){
                    result[count][0] = resuls.get(0);
                    result[count][1] = resuls.get(1);
                    count++;
                }
            }
            
        }
        return result;
        
    }
}
