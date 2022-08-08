class Solution {
    public int lastStoneWeight(int[] stones) {
        int result = 0;
        TreeMap<Integer,Integer> countTree = new TreeMap<>();
        for(int stone:stones){
            countTree.put(stone,countTree.getOrDefault(stone,0)+1);
        }
        if(countTree.keySet().size()==0){
            return 0;
        }
        while(countTree.keySet().size()>1){
            int maxStone = countTree.lastKey();
            int count1 = countTree.get(countTree.lastKey());
            if(count1 > 1){
                countTree.put(countTree.lastKey(),countTree.get(countTree.lastKey())-2);
            }else if(count1 == 1){
                countTree.remove(countTree.lastKey());
                int secondStone = countTree.lastKey();
                int count2 = countTree.get(countTree.lastKey());
                countTree.put(secondStone,countTree.get(secondStone)-1);
                if(countTree.get(secondStone) == 0){
                    countTree.remove(secondStone);
                }
                countTree.put(maxStone-secondStone,countTree.getOrDefault((maxStone-secondStone),0)+1);
                // System.out.println((maxStone-secondStone));
            }else{
                countTree.remove(countTree.lastKey());
            }
            
        }
        // System.out.println(countTree.firstKey());
        return countTree.get(countTree.firstKey()) % 2 == 0 ? 0:countTree.firstKey();
        
    }
}
