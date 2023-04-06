class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        int i;
        for(i = 0; i < strs[0].length(); i++){
            if(strs[0].charAt(i) != strs[strs.length - 1].charAt(i)){
                break;
            }
        }
        return strs[0].substring(0, i); 
        
        
//         String commonPrefix = "";
//         if(strs.length==0)
//              return commonPrefix;
        
//         String smallest = strs[0];
//         for(int i=1;i<strs.length;i++){
//             if(strs[i].length()<smallest.length())
//                 smallest = strs[i];
//         }        
		
//         for(int i=0; i<smallest.length(); i++){
//             boolean flag=true;
//             for(String str: strs){
//                 if(str.charAt(i)!=smallest.charAt(i)){
//                     flag=false;
//                     break;
//                 }
//             }
//             if(flag)
//                 commonPrefix+=smallest.charAt(i);
//             else
//                 return commonPrefix;
//         }
//         return commonPrefix;
    }
}

