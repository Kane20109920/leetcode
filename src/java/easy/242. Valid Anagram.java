class Solution {
    public boolean isAnagram(String s, String t) {
        TreeMap<String,Integer> sMap = new TreeMap<>();
        TreeMap<String,Integer> tMap = new TreeMap<>();
        for(int i = 0;i<s.length();i++){
            String key = String.valueOf(s.charAt(i));
            sMap.put(key,sMap.getOrDefault(key,0)+1);
        }
        for(int i = 0;i<t.length();i++){
            String key = String.valueOf(t.charAt(i));
            tMap.put(key,tMap.getOrDefault(key,0)+1);
        }
        return sMap.equals(tMap);
    }
}
