class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        String s1Sort = sortString(s1);
        for(int i = 0;i<=s2.length()-s1.length();i++){
            if(s1Sort.equals(sortString(s2.substring(i,i+s1.length())))){
                return true;
            }
        }
        return false;
        
    }
    public static String sortString(String s){
        char[] t = s.toCharArray();
        Arrays.sort(t);
        return new String(t);
    }
}
