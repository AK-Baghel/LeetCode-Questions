class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length() == 1 && s.charAt(0) == '1') 
            return true;
        for(int itr = 1; itr < s.length(); itr++){
            if(s.charAt(itr-1) == '0' && s.charAt(itr) == '1') 
                return false;
        }        
        return true;
    }
}