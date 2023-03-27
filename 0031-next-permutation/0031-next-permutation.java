
// https://youtu.be/x3B8_J-g7HE

class Solution {
    public static void swap(int nums[],int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reverse(int nums[],int i, int j){
        while(i<j){
            swap(nums,i++,j--);
        }
    }
    
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        int j=nums.length-1;
        
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        
        if(i>=0){
            while(j>i && nums[j]<=nums[i])
                j--;
            swap(nums,i,j);
        }
        
        reverse(nums,i+1,nums.length-1);
    }
}