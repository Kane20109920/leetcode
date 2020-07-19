class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int sum =0;
        int aIndex = a.length()-1;
        int bIndex = b.length()-1;
        while(aIndex >=0 || bIndex >=0){
            int tempA = 0;
            int tempB = 0;
            if(aIndex >= 0){
                tempA=Integer.parseInt(String.valueOf(a.charAt(aIndex)));
                sum += tempA;
                aIndex--;
            }
            if(bIndex >= 0){
                tempB=Integer.parseInt(String.valueOf(b.charAt(bIndex)));
                sum += tempB;                
                bIndex--;
            }
            result.insert(0,sum%2);
            sum = sum/2;
        }
        if(sum != 0){
            result.insert(0,sum);
        }
        return result.toString();
    }
}
