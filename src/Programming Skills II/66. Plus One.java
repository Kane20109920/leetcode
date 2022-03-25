class Solution {
    public int[] plusOne(int[] digits) {
        LinkedList<Integer> resultList = new LinkedList<>();
        int plus = 1;
        int addResult = 0;
        for(int i = digits.length-1;i>=0;i--){
            addResult = (digits[i]+plus)%10;
            plus = (digits[i]+plus)/10;
            resultList.addFirst(addResult);
        }
        if(plus != 0){
            resultList.addFirst(plus);
        }
        return resultList.stream().mapToInt(i -> i).toArray();
    }
}
