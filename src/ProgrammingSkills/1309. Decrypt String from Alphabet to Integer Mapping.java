class Solution {
    public String freqAlphabets(String s) {
        Map<String,String> dir = new HashMap<>();
        dir.put("1","a");
        dir.put("2","b");
        dir.put("3","c");
        dir.put("4","d");
        dir.put("5","e");
        dir.put("6","f");
        dir.put("7","g");
        dir.put("8","h");
        dir.put("9","i");
        dir.put("10","j");
        dir.put("11","k");
        dir.put("12","l");
        dir.put("13","m");
        dir.put("14","n");
        dir.put("15","o");
        dir.put("16","p");
        dir.put("17","q");
        dir.put("18","r");
        dir.put("19","s");
        dir.put("20","t");
        dir.put("21","u");
        dir.put("22","v");
        dir.put("23","w");
        dir.put("24","x");
        dir.put("25","y");
        dir.put("26","z");
        
        String[] splitS = s.split("#");
        StringBuilder result = new StringBuilder();
        int lastIndex = 0;
        for(String temp : splitS){
            lastIndex = Math.max(lastIndex,s.indexOf(temp))+1;
            if(s.indexOf("#",lastIndex) != -1){
                int start = 0;
                while(start < temp.length()-2){
                    
                    result.append(dir.get(String.valueOf(temp.charAt(start))));
                    start++;
                }
                
                String dirKey = String.valueOf(temp.charAt(start));
                if(start+1 < temp.length()){
                    dirKey+=String.valueOf(temp.charAt(start+1));
                }
                result.append(dir.get(dirKey));
            }
            else{
                for(int i = 0;i<temp.length();i++){
                    result.append(dir.get(String.valueOf(temp.charAt(i))));
                }
            }
        }
        return result.toString();
        
    }
}
