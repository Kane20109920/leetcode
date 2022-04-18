//topDown
class Solution {
    Map<Integer,Integer> tMap = new HashMap<>();
    public int tribonacci(int n) {
        if(n == 0){
            tMap.put(n,n);
            return tMap.get(n);
        } else if(n==1||n==2){
            tMap.put(n,1);
            return tMap.get(n);
        } else if(tMap.containsKey(n)){
            return tMap.get(n);
        } else{
            tMap.put(n,tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3));
            return tMap.get(n);
        }
    }
}
//buttonUp
class Solution {
    List<Integer> tList = new ArrayList<>();
    public int tribonacci(int n) {
        if(n<tList.size()){
            return tList.get(n);
        }
        int start = tList.size();
        for(int i = start;i<=n;i++){
            if(i == 0){
                tList.add(0);
            }else if (i == 1||i==2) {
                tList.add(1);
            }else{
                tList.add(tList.get(i-1)+tList.get(i-2)+tList.get(i-3));
            }
        }
        return tList.get(n);
    }
}
