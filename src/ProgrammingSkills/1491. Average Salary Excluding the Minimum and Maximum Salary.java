class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;
        for(int value:salary){
            max = value>max?value:max;
            min = value<min?value:min;
            sum += value;
        }
        return (sum-(max+min))/(salary.length-2);
    }
}
