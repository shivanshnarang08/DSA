import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Arrays.stream(candies).max().getAsInt(); 
        List<Boolean> result = new ArrayList<>(candies.length);

        for (int c : candies) {
            result.add(c + extraCandies >= maxCandies);
        }

        return result;
    }
}
