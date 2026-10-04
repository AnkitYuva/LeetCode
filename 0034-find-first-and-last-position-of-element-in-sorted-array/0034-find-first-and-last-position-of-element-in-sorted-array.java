class Solution {
    public int[] searchRange(int[] nums, int target) {
    //     int first=-1;
    //     int last=-1;
    //     for(int i = 0; i < nums.length; i++){
    //       if(nums[i]==target){
    //         if(first==-1) first=i;
    //         last=i;
    //       }
    // }
    //  return new int[] {first,last};

    int left = leftsearch(nums,target);
    int right = rightsearch(nums,target);
    return new int[] {left,right};
    }
    public int leftsearch(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(nums[mid]==target){
                ans = mid;
                high = --mid;
            }else if(nums[mid]<target){
                low = ++mid;
            }else{
                high = --mid;
            }
        }
        return ans;
    }
    public int rightsearch(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(nums[mid]==target){
                ans = mid;
                low = ++mid;
            }else if(nums[mid]<target){
                low = ++mid;
            }else{
                high = --mid;
            }
        }
        return ans;
    }
}