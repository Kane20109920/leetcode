class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        Map<Character,Character> charMap = new HashMap<>();
        Map<Character,Boolean> tMap = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(charMap.containsKey(sChar)){
                if(charMap.get(sChar) != tChar){
                    return false;    
                }
                
            }else{
                if(tMap.containsKey(tChar)){
                    return false;
                }else{
                    charMap.put(sChar,tChar);
                    tMap.put(tChar,true);
                }
            }
        }
        return true;
        
    }
}
