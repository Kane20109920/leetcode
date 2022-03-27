class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> result = new LinkedList<>();
        int plus = 0;
        int temp = k;
        int numLen = num.length-1;
        while(temp > 0 && numLen >= 0){
            int addResult = (plus+(temp%10)+num[numLen])%10;
            plus = (plus+(temp%10)+num[numLen])/10;
            result.addFirst(addResult);
            temp = temp/10;
            numLen--;
        }
        while(temp > 0){
            int addResult = (plus+(temp%10))%10;
            plus = (plus+(temp%10))/10;
            result.addFirst(addResult);
            temp = temp/10;
        }
        while(numLen >= 0){
            int addResult = (plus+num[numLen])%10;
            plus = (plus+num[numLen])/10;
            result.addFirst(addResult);
            numLen--;
        }
        if(plus > 0){
            result.addFirst(plus);
        }
        return result;
    }
}
