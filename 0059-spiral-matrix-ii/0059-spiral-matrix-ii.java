class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
        int count=0;
        int srow=0,scol=0,erow=n-1,ecol=n-1;
        while(srow<=erow && scol<=ecol){
            for(int i=scol;i<=ecol;i++)
                arr[srow][i]=++count;
            
            for(int i=srow+1;i<=erow;i++)
                arr[i][ecol]=++count;
            
            for(int i=ecol-1;i>=scol;i--){
                if(srow==erow)
                    break;
                arr[erow][i]=++count;
            }
            
            for(int i=erow-1;i>=srow+1;i--){
                if(scol==ecol)
                    break;
                arr[i][scol]=++count;
            }    
            
            srow++;
            scol++;
            erow--;
            ecol--;
        }
        return arr;
    }
}

