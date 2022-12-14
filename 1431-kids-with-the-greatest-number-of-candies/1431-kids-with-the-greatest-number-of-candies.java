class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = 0;
        for(int n : candies)
            max = Math.max(max, n);
        
        for(int i = 0; i < candies.length; i++){
            res.add((extraCandies + candies[i] >= max));
        }
        return res;
    }
}