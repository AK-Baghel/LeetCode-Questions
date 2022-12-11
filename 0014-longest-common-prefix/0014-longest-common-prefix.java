class Solution {
    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
		
		// Check if array is empty.
        if(strs.length==0) return commonPrefix;
        
		// Get the smallest string in the Array.
        String smallest = getSmallestString(strs);
		
		// Run loop for each char
        for(int i=0; i<smallest.length(); i++){
            boolean matchFlag = true;
			// Check char in all strings
            for(String str: strs){
                if(str.charAt(i)!=smallest.charAt(i)){
                    matchFlag=false;
                    break;
                }
            }
            if(!matchFlag){
                break;
            }
            commonPrefix+=smallest.charAt(i);
        }
        return commonPrefix;
    }
    
	//Method to return smallest string from the array.
    public String getSmallestString(String[] strs){
        String smallest = strs[0];
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()<smallest.length()){
                smallest = strs[i];
            }
        }
        return smallest;
    }
}