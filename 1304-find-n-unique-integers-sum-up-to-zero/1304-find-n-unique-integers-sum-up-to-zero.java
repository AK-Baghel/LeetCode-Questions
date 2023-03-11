class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        for(int i=0;i<n/2;i++){
            arr[i]=-(i+1);
            arr[n-1-i]=i+1;
        }
        return arr;
    }
}