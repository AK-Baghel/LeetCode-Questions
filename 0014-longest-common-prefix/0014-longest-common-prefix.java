class Solution {
    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
		
        if(strs.length==0)
             return commonPrefix;
        
        String smallest = strs[0];
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()<smallest.length())
                smallest = strs[i];
        }        
		
        for(int i=0; i<smallest.length(); i++){
            boolean flag=true;
            for(String str: strs){
                if(str.charAt(i)!=smallest.charAt(i)){
                    flag=false;
                    break;
                }
            }
            if(flag)
                commonPrefix+=smallest.charAt(i);
            else
                return commonPrefix;
        }
        return commonPrefix;
    }
}

