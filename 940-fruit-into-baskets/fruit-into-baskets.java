class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0, maxLen = 0;
        int[] count = new int[100001]; 
        int distinct = 0;

        for (int r = 0; r < fruits.length; r++) {
            if (count[fruits[r]] == 0) distinct++;
            count[fruits[r]]++;

            if (distinct > 2) {
                count[fruits[l]]--;
                if (count[fruits[l]] == 0) distinct--;
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
}
