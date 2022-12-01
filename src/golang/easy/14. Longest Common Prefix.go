func longestCommonPrefix(strs []string) string {
	var result strings.Builder
	for i := 0; ; i++ {
		for _, str := range strs {
			if i == len(str) || strs[0][i] != str[i] {
				return result.String()
			}
		}
		result.WriteByte(strs[0][i])
	}
    
}
