class Solution {

    //To understand the Q watch video from notes.......

    //reverse function.....
    public static void reverse(int nums[],int l,int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }

    public void rotate(int[] nums, int k) {

        k=k%nums.length;
        if(k<0){
            k=k+nums.length;         // when k is negeative
        }

        //reverse part 1 array
        int l=0,r=nums.length-1-k; //8-1-3=3 index
        reverse(nums,l,r);

        //reverse part 2 array
        l=r+1;
        r=nums.length-1;
        reverse(nums,l,r);

        //reverse complete array
        reverse(nums,0,nums.length-1);


    }
}