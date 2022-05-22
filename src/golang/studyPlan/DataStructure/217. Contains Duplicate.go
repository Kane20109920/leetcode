func containsDuplicate(nums []int) bool {
    sort.Ints(nums);
    var temp = nums[0];
    var numsLen = len(nums);
    var result = false;
    for i:= 1 ; i< numsLen;i++ {
        if(temp == nums[i]){
            result = true;
        }
        temp = nums[i];
    }
    return result;
}
