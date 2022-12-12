class Solution {
    public String reversePrefix(String word, char ch) {
        String a=word.substring(0,word.indexOf(ch)+1);
        String b=word.substring(word.indexOf(ch)+1);
        StringBuilder sb=new StringBuilder(a);
        sb.reverse();
        sb.append(b);
        return sb.toString();
        
    }
}