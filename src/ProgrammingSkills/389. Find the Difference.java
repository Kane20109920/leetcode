class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> charMapS = new HashMap<>();
        Map<Character,Integer> charMapT = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            charMapS.put(s.charAt(i),charMapS.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0;i<t.length();i++){
            charMapT.put(t.charAt(i),charMapT.getOrDefault(t.charAt(i),0)+1);
        }
        char result = 'a';
        for(char key : charMapT.keySet()){
            if(charMapT.get(key) != charMapS.get(key)){
                result = key;
            }
        }
        return result;
    }
}
