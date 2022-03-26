class Solution {
    public String multiply(String num1, String num2) {
        int[] multResultArr = new int[num1.length()+num2.length()];    
        StringBuilder result = new StringBuilder();
        for(int i = num2.length()-1;i>=0;i--){
            for(int j = num1.length()-1;j>= 0;j--){
                int tempResult = multResultArr[i+j+1];
                int multResult = (num1.charAt(j)-'0')*(num2.charAt(i)-'0');
                multResult = tempResult+multResult;
                int plus = multResult/10;
                multResultArr[i+j+1] = multResult%10;
                multResultArr[i+j] += plus;
            }
            
        }
        for(int p : multResultArr){
            //第一位數是否為0以及檔0000
            if(!(result.length() == 0 && p == 0)) result.append(p);
        }
			
        return result.length() == 0 ? "0" : result.toString();
        
        
    }
}
