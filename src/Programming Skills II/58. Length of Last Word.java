class Solution {
    public int lengthOfLastWord(String s) {
        int result = 0;
        String[] temp = s.split(" ");
        for(int i = temp.length-1;i>=0;i--){
            if(temp[i].length() > 0){
                
                return temp[i].length();
            }
        }
        return 0;
    }
}
