func searchInsert(nums []int, target int) int {
    var left,right int = 0,len(nums)-1;
    for left<right {
        var mid int = (left+right)/2;
        if(nums[mid] == target){
            return mid;
        }else if (nums[mid] < target){
            left = mid+1;
        }else{
            right = mid-1;
        }
    }
    if(nums[left] < target){
        return left+1;
    }
    return left;
}
