class Solution {
    public int majorityElement(int[] nums) {
        
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>n/2){
                        return nums[i];
                    }
        }
        return 1;
    }
}