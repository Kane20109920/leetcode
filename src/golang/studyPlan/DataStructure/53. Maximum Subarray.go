func maxSubArray(nums []int) int {
    var tempResult = 0;
    var tempMap = make([]int, len(nums));
    
    for i, num := range nums{
        var temp = tempResult + num;
        if temp < num {
            tempMap[i] = num;
            
        } else {
            tempMap[i] = temp;
        }
        tempResult = tempMap[i];
    }
    var result = tempMap[0];
    for i:= 1;i<len(tempMap);i++{
        if(result < tempMap[i]){
            result = tempMap[i];
        }
    }
    return result;
}
