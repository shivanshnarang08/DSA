class Solution {
    public void dfs(int sr,int sc,int[][] ans,int[][] image,int color,int[] delrow,int[] delcol,int inicolour){
        ans[sr][sc]=color;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++){
            int nrow=sr+delrow[i];
            int ncol=sc+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==inicolour && ans[nrow][ncol]!=color){
                dfs(nrow,ncol,ans,image,color,delrow,delcol,inicolour);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans=image;
        int inicolour=image[sr][sc];
        int[] delrow={-1,0,1,0};
        int[] delcol={0,+1,0,-1};
        dfs(sr,sc,ans,image,color,delrow,delcol,inicolour);
        return ans;
    }
}