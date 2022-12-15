class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        for(int[] rc : indices)
        {
            for(int i = 0;i<n;i++)
                mat[rc[0]][i]++;
            for(int j =0;j<m;j++)
                mat[j][rc[1]]++;
        }

        int ans = 0;
        for(int[] arr : mat)
            for(int ele : arr)
            {
                if(ele%2 != 0)
                    ans++;
            }

        return ans;
    }
}