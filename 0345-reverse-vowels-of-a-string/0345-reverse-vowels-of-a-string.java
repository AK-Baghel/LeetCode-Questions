class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                vowels.add(s.charAt(i));
            }
        } 
        // System.out.println(vowels);   
        for(int i=0,j=vowels.size()-1;i<s.length();i++){
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                    s=s.substring(0,i)+vowels.get(j)+s.substring(i+1);
                    //  System.out.println(s);   
                    j--;
                 }
        }
       return s; 
    }
}