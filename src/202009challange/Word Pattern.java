class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strArray = str.split(" ");
        if(strArray.length != pattern.length()){
            return false;
        }
        Map<String,Integer> patternMap = new HashMap<>();
        Map<String,Integer> strMap = new HashMap<>();
        for(int i = 0;i<pattern.length();i++){
            if(!patternMap.containsKey(String.valueOf(pattern.charAt(i)))){
                patternMap.put(String.valueOf(pattern.charAt(i)),i);    
            }
            if(!strMap.containsKey(strArray[i])){
                strMap.put(strArray[i],i);
            }
            if(patternMap.containsKey(String.valueOf(pattern.charAt(i))) && strMap.containsKey(strArray[i]) ){
                Integer p = patternMap.get(String.valueOf(pattern.charAt(i)));
                Integer s = strMap.get(strArray[i]);
                if(!p.equals(s)){
                    // System.out.println(patternMap.toString());
                    // System.out.println(strMap.toString());
                    return false;
                }
            }

        }
        Integer p = patternMap.get(String.valueOf(pattern.charAt(pattern.length()-1)));
        Integer s = strMap.get(strArray[strArray.length-1]);
        if(!p.equals(s)){
            return false;
        }
        return true;
        
    }
}
