/** 
 * Forward declaration of isBadVersion API.
 * @param   version   your guess about first bad version
 * @return 	 	      true if current version is bad 
 *			          false if current version is good
 * func isBadVersion(version int) bool;
 */

func firstBadVersion(n int) int {
    var left int = 0;
    var right int = n;
    for left<right {
        var min = (left+right)/2;
        if(isBadVersion(min)){
            right = min;
        }else{
            left = min+1;
        }
    }
    if(isBadVersion(left)){
        return left;
    }
    return right;
}
