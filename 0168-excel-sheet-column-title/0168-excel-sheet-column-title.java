class Solution {
    public String convertToTitle(int columnNumber) {
        int n=columnNumber;
        String res="";
        while(n>0){
            res=(char)('A'+(n-1)%26)+res;
            n=(n-1)/26;
        }
        return res;
    }
}