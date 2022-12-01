func halvesAreAlike(s string) bool {
    firstCount := 0;
    secondCount := 0;
    halfLen := len(s)/2;
    halfStart := len(s)/2;
    for i := 0;i<halfLen;i++ {
        if(strings.Contains("aeiouAEIOU",string(s[i]))){
            firstCount++;
        }
        if(strings.Contains("aeiouAEIOU",string(s[halfStart+i]))){
            secondCount++;
        }
    }
    return firstCount == secondCount;
    
}
