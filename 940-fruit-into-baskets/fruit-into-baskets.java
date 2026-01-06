class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,maxlength=0;
        int distinct=0;
        int[] count=new int[100001];
        for(int r=0;r<fruits.length;r++){
            if(count[fruits[r]]==0) distinct++;
            count[fruits[r]]++;
            if(distinct>2){
                count[fruits[l]]--;
                if(count[fruits[l]]==0) distinct--;
                l++;
            }
            maxlength=Math.max(maxlength,r-l+1);
        }
        return maxlength;
    }
}