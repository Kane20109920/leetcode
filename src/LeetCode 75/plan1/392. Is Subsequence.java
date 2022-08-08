class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }
        if(s.length() == 0){
            return true;
        }
        boolean result = true;
        int startIndex = -1;
        for(int i = 0;i<s.length() && result;i++){
            // System.out.println(startIndex);
            String temp = String.valueOf(s.charAt(i));
            
            int nextIndex = t.indexOf(temp,startIndex+1);
            result = nextIndex!=-1?true:false;
            startIndex = nextIndex;
            
        }
        return result;
    }
}
