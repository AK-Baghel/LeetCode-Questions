class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int val=0;
        
        if(ruleKey.equals("color")) 
            val=1;
        else if(ruleKey.equals("name"))
            val=2;

        for(List s:items){
            if(s.get(val).equals(ruleValue))
                count++;
        }
        return count;
    }
}