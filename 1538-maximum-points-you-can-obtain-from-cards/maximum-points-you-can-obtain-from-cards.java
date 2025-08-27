class Solution {
    public int maxScore(int[] cardPoints, int k) {
          int leftsum=0,rightsum=0,maxsum=0;
        for(int i=0;i<=k-1;i++){
          leftsum=leftsum+cardPoints[i];
        }
          maxsum=leftsum;
          int rightindex=cardPoints.length-1;
          for(int j=k-1;j>=0;j--){
            leftsum=leftsum-cardPoints[j];
            rightsum=rightsum+cardPoints[rightindex];
            rightindex--;
            maxsum=Math.max(maxsum,leftsum+rightsum);
          }

        return maxsum;
    }
}