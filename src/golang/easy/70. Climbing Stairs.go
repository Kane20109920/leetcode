func climbStairs(n int) int {
    // var path [n+1]int;
    var path = make([]int, n+1);
    path[0] = 1;
    path[1] = 1;
    
    for i := 2 ; i<len(path) ; i++{
        path[i] = path[i-1]+path[i-2];
    }
    return path[n];
}
