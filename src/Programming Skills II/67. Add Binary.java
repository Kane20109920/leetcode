class Solution {
    public String addBinary(String a, String b) {
        int plus = 0;
        StringBuilder result = new StringBuilder();
        int end = 0;
        
        while(a.length()-1-end >= 0 && b.length()-1-end >=0){
            int aTarget = Integer.valueOf(a.charAt(a.length()-1-end)-'0');
            int bTarget = Integer.valueOf(b.charAt(b.length()-1-end)-'0');
            int tempPlus = aTarget&bTarget;
            
            int addResult = aTarget^bTarget^plus;
            System.out.println("temp\t"+tempPlus+"\t"+plus+"\t"+addResult);
            plus = (aTarget&bTarget)|(aTarget&plus)|(bTarget&plus);
            result.insert(0, addResult);
            end++;
        }
        
        while(a.length()-1-end >= 0){
            int aTarget = Integer.valueOf(a.charAt(a.length()-1-end)-'0');
            int tempPlus = aTarget&plus;
            int addResult = aTarget^plus;
            plus = tempPlus;
            result.insert(0, addResult);
            end++;
        }
        
        while(b.length()-1-end >= 0){
            int bTarget = Integer.valueOf(b.charAt(b.length()-1-end)-'0');
            int tempPlus = bTarget&plus;
            int addResult = bTarget^plus;
            plus = tempPlus;
            result.insert(0, addResult);
            end++;
        }
        if(plus != 0){
            result.insert(0, plus);
        }
        
        return result.toString();
    }
}
