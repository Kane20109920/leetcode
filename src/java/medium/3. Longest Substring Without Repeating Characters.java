class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0,windowLeftIndex = 0;
        Map<Character,Integer> charMap = new HashMap<>();
        for(int i = 0;i< s.length();++i){
            if(charMap.containsKey(s.charAt(i))){
                res = Math.max(i - windowLeftIndex, res);
                windowLeftIndex = Math.max(windowLeftIndex,charMap.get(s.charAt(i))+1);
            }
            charMap.put(s.charAt(i),i);
        }
        return Math.max(res,s.length()-windowLeftIndex);
    }
}
