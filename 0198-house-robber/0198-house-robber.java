class Solution {
    public int rob(int[] nums) {
        int len=nums.length;
        
        int prev=0;
        int curr=0;
        
        for(int i=len-1;i>=0;i--){
            
            int a=nums[i]+prev;
            int b=curr;
            prev=curr;
            curr=Math.max(a,b);
            
        }
        
        return curr;
    }
}