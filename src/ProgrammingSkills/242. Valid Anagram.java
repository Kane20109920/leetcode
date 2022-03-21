class Solution {
    public boolean isAnagram(String s, String t) {
        TreeMap<Character,Integer> sMap = new TreeMap<>();
        TreeMap<Character,Integer> tMap = new TreeMap<>();
        for(int i = 0;i<s.length();i++){
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0;i<t.length();i++){
            tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i),0)+1);
        }
        return sMap.equals(tMap);
    }
}
