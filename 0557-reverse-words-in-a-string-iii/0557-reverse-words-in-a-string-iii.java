class Solution {
    public String reverseWords(String s) {
        // int j=0;
        // String arr[]=s.split(" ");
        // for(int i=0;i<arr.length;i++){
        //     StringBuilder sb=new StringBuilder();
        //     arr[i]=sb.append(arr[i]).reverse().toString();
        // }
        // return String.join(" ",arr);
        
        String[] a = s.split(" ");
        for (int i = 0; i < a.length; i++) {
         a[i] = new StringBuilder(a[i]).reverse().toString();
        }
        return String.join(" ", a);
    }
}



