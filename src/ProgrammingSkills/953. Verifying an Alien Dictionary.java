class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i =0;i<words.length-1;i++){
            if(isNotAlien(words[i],words[i+1],order)){
                return false;
            }
        }
        return true;
    }
    private boolean isNotAlien(String w1,String w2,String order){
        if(w1.equals(w2)){
            return false;
        }
        for(int i = 0;i<w1.length();i++){
            if(i == w2.length()){
                return true;
            }
            char c1 = w1.charAt(i);
            char c2 = w2.charAt(i);
            if(c1 != c2){
                int index1 = order.indexOf(c1);
                int index2 = order.indexOf(c2);
                return index2<index1;
            }
        }
        return false;
    }
}
