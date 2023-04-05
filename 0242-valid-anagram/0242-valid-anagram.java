class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())
             return false;
        int arr[]=new int[26];
        for(char c:s.toCharArray())
            arr[c-'a']++;
        for(char c:t.toCharArray()){
            if(arr[c-'a']==0)
                return false;
            arr[c-'a']--;
        }
        return true;
        
        //TC-O(nlogn) SC-O(n))
        
        // if(s.length()!=t.length())
        //     return false;
        // char s1[]=s.toCharArray();
        // Arrays.sort(s1);
        // char s2[]=t.toCharArray();
        // Arrays.sort(s2);
        // for(int i=0;i<s.length();i++){
        //     if(s1[i]!=s2[i])
        //         return false;
        // }
        // return true;
    }
}