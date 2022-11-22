class Solution {
    Map<Integer,Integer> sqMap = new HashMap<>();
    public int numSquares(int n) {
        if(n < 4 ){
            sqMap.put(n,n);
            return sqMap.get(n);
        }
        int ans = n;
        if(sqMap.containsKey(n)){
            return sqMap.get(n);
        }
        for(int i = 1;i*i <=n ;i++){
            ans = Math.min(ans,1+numSquares(n-(i*i)));
        }
        sqMap.put(n,ans);
        return sqMap.get(n);
        
    }
}

class Solution {
    public int numSquares(int n) {
        int[] result = new int[n+1];
        for(int i = 1;i<result.length;i++){
            result[i] = i;
            for(int j = 1;j*j<=i;j++){
                result[i] = Math.min(result[i],1+result[i-(j*j)]);
            }
        }
        return result[n];
        
    }
}
