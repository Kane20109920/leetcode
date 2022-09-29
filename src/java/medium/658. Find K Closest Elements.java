class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length-1;
        List<Integer> result = new ArrayList<>();
        while(right-left+1 > k){
            if(Math.abs(arr[left]-x) > Math.abs(arr[right]-x)){
                left++;
            }else if(Math.abs(arr[left]-x) <= Math.abs(arr[right]-x)){
                right--;
            }
            
        }
        for(int i = left;i<=right;i++){
            result.add(arr[i]);
        }
        return result;
        
    }
}
