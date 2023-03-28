class Solution {
    public int maxProduct(int[] nums) {
       int mul1=1;
        int max1=nums[0];
        for(int i=0;i<nums.length;i++){
            mul1=mul1*nums[i];
            max1=Math.max(max1,mul1);
            if(mul1==0) mul1=1;
        }
        int mul2=1;
        int max2=nums[0];
        for(int i=nums.length-1;i>=0;i--){
            mul2=mul2*nums[i];
            max2=Math.max(max2,mul2);
            if(mul2==0) mul2=1;
        }
        int res=Math.max(max1,max2);
        return res;
    }
}