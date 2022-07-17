class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        for(int match:matchsticks){
            sum += match;
        }
        if(sum %4 != 0){
            return false;
        }
        Arrays.sort(matchsticks);
        return countMatches(matchsticks,matchsticks.length-1,sum/4,0,0,0,0);
        
    }
    private boolean countMatches(int[] matchsticks,int index,int target,int top,int button,int left,int right){
        if(target == top && target == button && target == left && target == right){
            return true;
        }
        
        if(target < top || target < button || target < left || target < right){
            return false;
        }
        int val = matchsticks[index];
        boolean topResult = countMatches(matchsticks,index-1,target,top+val,button,left,right);
        if(topResult){
            return topResult;
        }
        boolean buttonResult = countMatches(matchsticks,index-1,target,top,button+val,left,right);
        if(buttonResult){
            return buttonResult;
        }
        boolean leftResult = countMatches(matchsticks,index-1,target,top,button,left+val,right);
        if(leftResult){
            return leftResult;
        }
        boolean rightResult = countMatches(matchsticks,index-1,target,top,button,left,right+val);
        if(rightResult){
            return rightResult;
        }
        return false;
        
    }
}
