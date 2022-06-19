func reverseWords(s string) string {
    var sArray []string = strings.Split(s, " ");
    
    var result = make([]string,len(sArray));
    for i := range sArray {
        
        var temp = []rune(sArray[i]);
        var start,end = 0 , len(temp)-1;
        
        for start < end {
            var temp2 = temp[start];
            temp[start] = temp[end];
            temp[end] = temp2;
            start++;
            end--;
        }
        result[i] = string(temp);
    }
    return strings.Join(result," ");
}
