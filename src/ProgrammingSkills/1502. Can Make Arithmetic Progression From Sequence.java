class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int step = Math.abs(arr[0]-arr[1]);
        for(int i = 0 ;i< arr.length-1;i++){
            int temp = Math.abs(arr[i]-arr[i+1]);
            if(step - temp != 0){
                return false;
            }
            
        }
        return true;
    }
}
