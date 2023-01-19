class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {  
        int result = numBottles;
        int emptyBottles = numBottles;
        while(emptyBottles >= numExchange) {
            numBottles = emptyBottles / numExchange;
            emptyBottles = numBottles + emptyBottles % numExchange;
            result += numBottles;
        }
        return result;
    }
}