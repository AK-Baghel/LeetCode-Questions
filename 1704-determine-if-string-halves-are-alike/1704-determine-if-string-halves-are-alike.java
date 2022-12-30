class Solution {
    public boolean halvesAreAlike(String s) {
        int a=0,b=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length()/2;i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                a++;
            }
        }
        for(int i=s.length()/2;i<s.length();i++){
            char d=s.charAt(i);
            if(d=='a' || d=='e' || d=='i' || d=='o' || d=='u'){
                b++;
            }
        }
        if(a == b)
            return true;
        else
            return false;
    }
}

// or

// String a = s.substring(0, s.length()/2);
//         String b = s.substring(s.length()/2);
//         int p = 0, q = 0;
//         for (int i = 0; i < a.length(); i++)
//         {
//             char c = Character.toLowerCase(a.charAt(i));
//             if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
//                 p++;
//             char d = Character.toLowerCase(b.charAt(i));
//             if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u') 
//                 q++;
//         }
//         return (p==q);