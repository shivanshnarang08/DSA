class Solution {
    public int singleNumber(int[] nums) {
        int count=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            int num=nums[i];
            for(int j=0;j<nums.length;j++){
                if(nums[j]==num){
                    count++;
                }
            }
            if(count<2){
                ans=num;
            }
        }
        return ans;
    }
}