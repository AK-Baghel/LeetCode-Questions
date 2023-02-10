class Solution {
    public boolean rotateString(String s, String goal) {
        
        //Soln-1, by using concatenation & contain properties...
        String s1=s+s;
        if(s1.contains(goal) && s.length()==goal.length())
            return true;
        return false;
        
        //Soln-2, by using StringBuilder & SubString properties...
        // if(s.equals(goal))
        //     return true;
        // StringBuilder sb=new StringBuilder("");
        // for(int i=1;i<s.length();i++){
        //     sb.append(s.substring(i,s.length()));
        //     sb.append(s.substring(0,i));
        //     if(sb.toString().equals(goal))
        //         return true;
        //     sb.delete(0,s.length());
        // }
        // return false;
    }
}