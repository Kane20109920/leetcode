class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Map<Integer,Integer> nextGreatMap = new HashMap<>();
        Stack<Integer> stack = new Stack<Integer>(); 
        int min = nums2[0];
        for(int i = nums2.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<nums2[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nextGreatMap.put(nums2[i],-1);
            }else{
                nextGreatMap.put(nums2[i],stack.peek());
            }
            stack.push(nums2[i]);    
            
        }
        
        for(int i = 0;i<nums1.length;i++){
            result[i] = nextGreatMap.get(nums1[i]);
        }
        return result;
    }
}
