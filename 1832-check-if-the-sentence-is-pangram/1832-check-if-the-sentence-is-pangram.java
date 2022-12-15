class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean arr[]=new boolean[26];
        int count=0;
        for(int i=0;i<sentence.length();i++){
            if(arr[sentence.charAt(i)-'a']!=true){
                arr[sentence.charAt(i)-'a']=true;
                count++;
            }
        }
        if(count==26){
            return true;
        }
        return false;
    }
}