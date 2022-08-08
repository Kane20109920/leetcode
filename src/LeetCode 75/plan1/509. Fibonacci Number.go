func fib(n int) int {
    if(n == 0 || n == 1){
        return n;
    }
    var first , second int = 0,1;
    var result int = first+second;
    for i := 2 ;i<=n;i++ {
        result = first+second;
        first = second;
        second = result;
    }
    return result;
}
