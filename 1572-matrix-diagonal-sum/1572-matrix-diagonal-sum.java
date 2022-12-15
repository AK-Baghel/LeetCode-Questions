class Solution {
    public int diagonalSum(int[][] mat) {
        // int sum=0,i=0;
        // while(i<mat.length){
        //     sum+=mat[i][mat.length-1-i];
        //     sum+=mat[i][i];
        //     i++;
        // }
        // if(mat.length%2!=0)
        //     return (sum-mat[mat.length/2][mat.length/2]);
        // return sum;

        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
            int j=n-1-i;
            if(i!=j)
                sum+=mat[i][j];
        }
        return sum;
    }
}