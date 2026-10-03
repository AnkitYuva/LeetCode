class Solution {
    public int trap(int[] height) {
        int low = 0;
        int high = height.length-1;
        int left = 0;
        int right = 0;
        int total = 0;
        while(low<high){
            if(height[low]<height[high]){
                left=Math.max(left,height[low]);
                total += left - height[low];
                low++;
            }else{
                right = Math.max(right,height[high]);
                total +=right-height[high];
                high--;
            }
        }
        return total;
    }
}