class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int ans[]=new int[nums.length];
        int curr=1;
        
        for(int i=0;i<nums.length;i++){
            ans[i]=curr;
            curr*=nums[i];
        } 
        
        curr=1;
        
        for(int i=nums.length-1;i>=0;i--){
            ans[i]*=curr;
            curr*=nums[i];
        }
        
        return ans;
        
    }
}


// TC o(n) & SC o(1) where space of answer array is ignore