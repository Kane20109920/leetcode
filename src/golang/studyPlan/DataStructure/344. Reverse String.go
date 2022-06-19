func reverseString(s []byte)  {
    var start,end = 0, len(s)-1;
    for start < end {
        var temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        start++;
        end--;
    }
}
