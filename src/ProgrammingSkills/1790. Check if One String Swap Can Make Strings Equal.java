//因為只能做一次swap，所以用一個List記錄不同字元的index，swap只能有兩個字元，如果只有一個不同，代表為不同的字串，兩個時檢查swap的字元是否相等
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        else if(s1.length() != s2.length()){
            return false;
            
        }
        else{
            List<Integer> diffIndexList = new ArrayList<>();
            for(int i =0;i<s1.length() && diffIndexList.size()<3;i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    diffIndexList.add(i);
                }
            }
            boolean swapAble = diffIndexList.size() == 2 && ((s1.charAt(diffIndexList.get(0)) == s2.charAt(diffIndexList.get(1)) )&& (s1.charAt(diffIndexList.get(1)) == s2.charAt(diffIndexList.get(0)) ));
            return diffIndexList.size() == 0 || swapAble;
        }
        
    }
}
