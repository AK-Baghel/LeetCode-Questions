class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal))
            return true;
        StringBuilder sb=new StringBuilder("");
        for(int i=1;i<s.length();i++){
            sb.append(s.substring(i,s.length()));
            sb.append(s.substring(0,i));
            if(sb.toString().equals(goal))
                return true;
            sb.delete(0,s.length());
        }
        return false;
    }
}