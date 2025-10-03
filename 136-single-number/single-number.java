class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        Set<Integer> keys=hmap.keySet();
        for(int i:keys){
            if(hmap.get(i)==1){
                return i;
            }
        }
        return -1;
    }
}