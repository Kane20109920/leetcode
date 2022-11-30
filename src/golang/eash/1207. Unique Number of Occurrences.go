func uniqueOccurrences(arr []int) bool {
    var countMap map[int]int;
    countMap = make(map[int]int);
    
    for _,value := range arr {
        countMap[value] = countMap[value]+1;
    }
    
    for key1,value1 := range countMap {
        for key2,value2 := range countMap {
            if (key1 != key2 && value1 == value2) {
                return false;
            }
        }
    }
    
    return true;
}
