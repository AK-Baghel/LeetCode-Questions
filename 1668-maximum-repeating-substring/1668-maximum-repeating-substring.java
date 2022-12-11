class Solution {
    public int maxRepeating(String sequence, String word) {

        String w1 = word;
        int res = 0;
        while (w1.length() <= sequence.length()) {
            if (sequence.contains(w1)) {
                res++;
                w1 += word;
            } else {
                break;
            }
        }
        
        return res;
}
}