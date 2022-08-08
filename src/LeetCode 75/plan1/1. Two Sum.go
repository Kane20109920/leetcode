func twoSum(nums []int, target int) []int {
    targetMap := make(map[int]int) 
    
    var result []int
    
    for i, num := range nums {
        if k, ok := targetMap[target-num]; ok{
            return []int{k,i}
        }
        targetMap[num] = i
    }
    return result
}
