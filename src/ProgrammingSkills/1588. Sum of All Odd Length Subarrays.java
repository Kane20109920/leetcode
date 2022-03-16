class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int result = 0;
        int subLength = 1;
        while(subLength <= arr.length){
            for(int i = 0;i<arr.length;i++){
                int end = i+subLength;
                if(end <= arr.length){
                    for(int j = i ;j<end;j++){

                        result += arr[j];
                    }
                }
                
            }
            subLength +=2 ;
        }
        return result;
    }
}
