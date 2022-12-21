class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        int s=0,e=nums.length-1;

        //1st binary search for finding the left most extreme target Value.    
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                arr[0]=mid;
                e=mid-1;
            }
            else if(nums[mid]<target)
                s=mid+1;
            else
                e=mid-1;
        }
        //2nd binary search for finding the right most extreme target Value.    
        s=0;
        e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                arr[1]=mid;
                s=mid+1;
            }
            else if(nums[mid]<target)
                s=mid+1;
            else
                e=mid-1;
        }
        return arr;
    }
}