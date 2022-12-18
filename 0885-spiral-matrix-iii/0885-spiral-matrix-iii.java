class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        // {0,1,0,-1,0}   directions  0-> col++, 1->row++, 2-> col-- 3->row--
        int directions[]={0,1,0,-1,0} ;
        
        int steps=0;
        int move=0;
        int count=0;
        int ans[][]=new int[rows*cols][2];
        ans[count][0]=rStart;
        ans[count][1]=cStart;
        count++;
        
        int row=rStart,col=cStart;
        
        while(count<rows*cols)
        {
            if(move==0 || move== 2)
                steps++;
            
            for(int i=0;i<steps;i++)
            {
                row+=directions[move];
                col+=directions[move+1];
               if(row<rows && row>=0 && col<cols && col>=0)
               {
                ans[count][0]=row;
                ans[count][1]=col;
                count++;
               }
                
            }
            if(move!=0)
            move=(move+1)%4;
            else 
                move++;
        }
        return ans;     
    }
}