class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remain=target-nums[i];
            if(hmap.containsKey(remain)){
                return new int[]{i,hmap.get(remain)};
            }
            hmap.put(nums[i],i);
        }
        return null;
    }
}