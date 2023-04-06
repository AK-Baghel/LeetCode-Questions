class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        StringBuilder sb=new StringBuilder();
        int count=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length()-1;i++){
            sb.append(s.charAt(i));
            for(int j=i+1;j<s.length();j++){
                if(!sb.toString().contains(Character.toString(s.charAt(j)))){
                    sb.append(s.charAt(j));
                    count++;
                    max=Math.max(count,max);
                }
                else{
                    sb.setLength(0);
                    count=1;
                    break;
                }
            }
        }
        return max<0 ? 1 : max;
    }
}