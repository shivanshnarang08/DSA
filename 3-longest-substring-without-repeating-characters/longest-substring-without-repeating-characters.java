class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        Arrays.fill(hash, -1);            

        int n = s.length();
        int l = 0;                      
        int maxlength = 0;

        for (int r = 0; r < n; r++) {
            char c = s.charAt(r);

            if (hash[c] != -1 && hash[c] >= l) {
                
                l = hash[c] + 1;
            }

           
            maxlength = Math.max(maxlength, r - l + 1);

            
            hash[c] = r;
        }

        return maxlength;
    }
}
