class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < piles.length; i++){
            max = Math.max(max,piles[i]);
        }
        int ans = 0;
        int low = 1;
        int high = max;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int total = check(piles,mid);
            if(total <= h){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public int check(int[] nums,int hour){
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total += Math.ceil((double)nums[i] / hour);
        }
        return total;
    }
}