class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int num:nums){
            hmap.put(num,hmap.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: hmap.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }
}