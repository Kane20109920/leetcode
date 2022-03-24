class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i = s.length()/2;i>0;i--){
            if( s.length() % i == 0){
                String sub = s.substring(0,i);
                StringBuilder temp = new StringBuilder();
                for(int j = 0;j<s.length()/i;j++){
                    temp.append(sub);
                }
                if(temp.toString().equals(s)){
                    return true;
                }    
            }
            
        }
        return false;
    }
}
