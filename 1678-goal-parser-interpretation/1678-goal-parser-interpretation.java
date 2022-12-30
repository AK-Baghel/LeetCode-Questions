class Solution {
    public String interpret(String command) {
        String a="";
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='(' && command.charAt(i+1)==')' ){
                a+='o';
                i++;
            }    
            else if(command.charAt(i)=='(' || command.charAt(i)==')'){
                continue;
            }
            else
                a+=command.charAt(i);
        }
        return a;
    }
}