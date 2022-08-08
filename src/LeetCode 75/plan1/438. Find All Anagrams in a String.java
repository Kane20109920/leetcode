class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[] pCharArray = p.toCharArray();
        int[] charDir = new int[26];
        for(char c:pCharArray){
            charDir[c-'a']++;
        }
        List<Integer> result = new LinkedList<>();
        for(int i = 0;i+pCharArray.length<=s.length();i++){
            String tempString = s.substring(i,i+pCharArray.length);
            if(check(tempString,charDir)){
                result.add(i);
            }
            
        }
        return result;
    }
    private boolean check(String tempString, int[] dir){
        int[] tempDir = dir.clone();
        for(int i = 0;i<tempString.length();i++){
            char temp = tempString.charAt(i);
            tempDir[temp-'a']--;
            if(tempDir[temp-'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
