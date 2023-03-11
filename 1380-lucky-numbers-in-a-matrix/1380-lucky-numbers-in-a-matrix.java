class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> finalAnswer = new ArrayList<>();
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        for(int i = 0; i < rowLength; i ++) {
            int row = i;
            int col = 0;
            int elementMin = Integer.MAX_VALUE;
            for(int j = 0; j < colLength; j ++) {
                if(elementMin > matrix[row][j]) {
                    elementMin = matrix[row][j];
                    col = j;
                }
            }
            int elementMax = Integer.MIN_VALUE;
            for(int j = 0; j < rowLength; j ++) {
                if(elementMax < matrix[j][col]) {
                    elementMax = matrix[j][col];
                }
            }
            if(elementMin == elementMax) {
                finalAnswer.add(elementMin);
            }
        }
        return finalAnswer;  
    }
}


