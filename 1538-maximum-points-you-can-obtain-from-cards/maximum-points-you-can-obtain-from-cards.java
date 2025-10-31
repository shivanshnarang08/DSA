class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0,rsum=0,maxsum=0;
        for(int i=0;i<=k-1;i++){
            lsum=lsum+cardPoints[i];
        }
        maxsum=lsum;
        int rightindex=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-cardPoints[i];
            rsum=rsum+cardPoints[rightindex];
            maxsum=Math.max(maxsum,lsum+rsum);
            rightindex--;
        }
        return maxsum;
    }

}