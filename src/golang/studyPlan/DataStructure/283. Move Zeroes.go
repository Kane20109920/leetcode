func moveZeroes(nums []int)  {
    var nonZeroIndex = 0;
    for i,val := range nums {
        if(val != 0){
            var temp = nums[nonZeroIndex];
            nums[nonZeroIndex] = val;
            nums[i] = temp;
            nonZeroIndex++;
        }
    }
    
}
