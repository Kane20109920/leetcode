func search(nums []int, target int) int {
    var startIndex int = 0;
    var endIndex int = len(nums) -1;
    for startIndex < endIndex {
        var minIndex int = (startIndex+endIndex)/2;
        if(nums[minIndex] == target){
            return minIndex;
        }
        if(nums[minIndex] < target){
            startIndex = minIndex+1;
        }else{
            endIndex = minIndex ;
        }
    }
    if(nums[startIndex] == target){
        return startIndex;
    }
    return -1;
    
}
