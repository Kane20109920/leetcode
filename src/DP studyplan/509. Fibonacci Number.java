// topDown
class Solution {
    private Map<Integer,Integer> fMap = new HashMap<>();
    public int fib(int n) {
        if(n == 1 || n == 0){
            fMap.put(n,n);
            return fMap.get(n);
        }else if(fMap.containsKey(n)){
            return fMap.get(n);
        }else{
            fMap.put(n,fib(n-1)+fib(n-2));
            return fMap.get(n);
        }
    }
}
//button up
class Solution {
    // buttonUp
    private List<Integer> list = new ArrayList<>();
    public int fib(int n) {
        if(list.size() < 2){
            list.add(0);
            list.add(1);
        }
        if(n < list.size()){
            return list.get(n);
        }
        int start = list.size();
        for(int i = start;i<=n;i++){
            
            list.add(list.get(i-1)+list.get(i-2));
        }
        return list.get(n);
    }
}
