class Solution {
    public boolean judgeCircle(String moves) {
        int a=0,b=0,c=0,d=0;
        char cmoves[]=moves.toCharArray();
        for(char i:cmoves){
            switch(i){
                case 'U':
                    a++;
                    break;
                case 'D':
                    b++;
                    break;
                case 'R':
                    c++;
                    break;
                case 'L':
                    d++;
                    break;
            }
        }
        if(a==b && c==d)
            return true;
        else
            return false;
    }
}