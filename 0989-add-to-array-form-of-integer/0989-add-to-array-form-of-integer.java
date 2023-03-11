class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        int cur = k;
        List<Integer> ans = new ArrayList();

        int i = n-1;
        while (i >= 0 || cur > 0) {
            if (i >= 0)
                cur += num[i];
            ans.add(cur % 10);
            cur /= 10;
            i--;
        }

        Collections.reverse(ans);
        return ans;
    }
}