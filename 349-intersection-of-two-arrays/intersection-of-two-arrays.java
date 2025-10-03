class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int n:nums1){
            hmap.put(n,1);
        }

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(hmap.containsKey(nums2[i]) && hmap.get(nums2[i])==1){
                hmap.put(nums2[i],0);
                list.add(nums2[i]);
            }
        }


         int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
    
        return res;
    }
}