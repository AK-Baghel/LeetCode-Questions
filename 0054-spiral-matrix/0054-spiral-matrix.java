class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> myList = new ArrayList<>();
        int  startrow=0,endrow=matrix.length-1,startcol=0,endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){

            for(int i=startcol;i<=endcol;i++){
                myList.add(matrix[startrow][i]);
            }
            for(int i=startrow+1;i<=endrow;i++){
                myList.add(matrix[i][endcol]);
            }
            for(int i=endcol-1;i>=startcol;i--){
                if(startrow==endrow){
                    break;
                }
                myList.add(matrix[endrow][i]);
            }
            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                myList.add(matrix[i][startcol]);
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        return myList;
    }
}