class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int n:nums1){
            hmap.put(n,1);
        }
        List<Integer> l=new ArrayList<>();
        for(int n:nums2){
            if(hmap.containsKey(n) && hmap.get(n)==1){
                hmap.put(n,0);
                l.add(n);
            }
        }
        int[] res=new int[l.size()];
        for(int i=0;i<l.size();i++){
            res[i]=l.get(i);
        }
        return res;
    }
}