class Solution {
    public String freqAlphabets(String s) {
        StringBuilder b = new StringBuilder();
        for(int i=0;i<s.length();)    
        {
            if(i+2<s.length() && s.charAt(i+2)=='#')
            {
                char ch = (char)((s.charAt(i)-'0')*10 + (s.charAt(i+1)-'0') + '`' );    //ASCII Code of ` is 96 
                b.append(ch);
                i+=3;
            }
            else
            {
                b.append((char)(s.charAt(i)-'0'+'`'));
                i++;
            }
        }
        return b.toString();
    }
}