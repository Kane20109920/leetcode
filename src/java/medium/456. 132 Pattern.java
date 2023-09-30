class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums.length >= 3){
            Stack<Integer> maxNumStack = new Stack<>();
            int third = Integer.MIN_VALUE;
            for(int i = nums.length-1;i>=0;i--){
                if(nums[i] < third){
                    return true;
                }
                while(!maxNumStack.isEmpty()&& maxNumStack.peek() < nums[i]){
                    third = maxNumStack.pop();
                }
                maxNumStack.push(nums[i]);
                System.out.println("nums[i]=\t"+nums[i]+"\tstackTop=\t"+maxNumStack.peek()+"\tthird=\t"+third);
            }
        }
        return false;
        
    }
}
