class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        getSets(result,new ArrayList<Integer>(),nums,0);
        // for(int setSize =0;setSize<nums.length;setSize++){
        //     List<List<Integer>> tempList = new ArrayList<>();
        //     getSets(setSize,tempList,nums);
        //     result.addAll(tempList);
        // }
        return result;
    }
    public void getSets(List<List<Integer>> results,List<Integer> tempList,int[] nums,int startIndex){
        results.add(new ArrayList(tempList));
        for(int i = startIndex;i<nums.length;i++){
            tempList.add(nums[i]);
            getSets(results,tempList,nums,i + 1);
            tempList.remove(tempList.size() -1);
        }
    }
}
