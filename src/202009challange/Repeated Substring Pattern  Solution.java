class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int sL = s.length();
        for(int i = sL/2;i>0;i--){
            if(sL%i == 0){
                String str = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                int times = sL/i;
                for(int j = 0;j<times;j++){
                    sb.append(str);
                }
                if(sb.toString().equals(s)){
                    return true;
                }
            }
            
        }
        return false;
    }
}
