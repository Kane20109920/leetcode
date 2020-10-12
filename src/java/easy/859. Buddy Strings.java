class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A.length() != B.length()){
            return false;
        }
        if(A.equals(B)){
            Set<Character> temp = new HashSet<>();
            for(char c:A.toCharArray()){
                if(temp.contains(c)){
                    return true;
                }
                temp.add(c);
            }
            return false;
        }
        List<Integer> indexList = new ArrayList<>();
        for(int i=0;i<A.length();i++) {
            if(A.charAt(i)!=B.charAt(i))
                indexList.add(i);
        }
        if(indexList.size() == 2){
            if(A.charAt(indexList.get(0)) == B.charAt(indexList.get(1))){
                if(A.charAt(indexList.get(1)) == B.charAt(indexList.get(0))){
                    return true;
                }
            }
        }
        return false;
    }
}
