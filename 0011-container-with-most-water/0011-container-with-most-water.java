class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int area,maxArea=Integer.MIN_VALUE;
        while(l<r){
            area=Math.min(height[l],height[r])*(r-l);
            maxArea=Math.max(maxArea,area);
            if(height[l]<height[r])
                l++;
            else if(height[l]>height[r])
                r--;
            else{
                l++;
                r--;
            }
        }
        return maxArea;
    }
}
