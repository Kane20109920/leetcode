class Solution {
    public boolean isHappy(int n) {
        Map<Integer,Boolean> stepMap = new HashMap<>();
        int target = n;
        while(target != 1){
            if(stepMap.containsKey(target)){
                return false;
            }
            stepMap.put(target,false);
            int temp = target;
            int nextTarget = 0;
            while(temp > 0){
                nextTarget += (int)Math.pow(temp%10,2);
                temp = temp/10;
            }
            target = nextTarget;
        }
        return true;
    }
}
