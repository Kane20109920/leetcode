class Solution {
    public int longestPalindrome(String s) {
        Set<Character> charSet = new HashSet<>();
        for(char temp:s.toCharArray()){
            if(charSet.contains(temp)){
                charSet.remove(temp);
            }else{
                charSet.add(temp);
            }
        }
        return charSet.isEmpty() ? s.length():s.length()-charSet.size()+1;
        
    }
}
