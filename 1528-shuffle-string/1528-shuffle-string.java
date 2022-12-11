class Solution {
    public String restoreString(String s, int[] indices) {
        char arr[]=new char[indices.length];
        for(int i=0;i<indices.length;i++){
            arr[indices[i]]=s.charAt(i);
        }
        String sb="";
        for(char i:arr){
            sb+=i;
        }
        return sb;
    }
}
