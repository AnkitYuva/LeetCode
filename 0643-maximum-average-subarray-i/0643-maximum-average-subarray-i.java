class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double total = Double.NEGATIVE_INFINITY;
        int low = 0;
        int high = k - 1;
        double sum = 0;
            for(int i = low; i <= high; i++){
                sum += nums[i];
            }
            total = sum / k;
            while(high < nums.length-1){
                sum = sum - nums[low]+nums[high+1];
            double avg = sum / k;
            if(avg > total){
                total = avg;
            }
            low++;
            high++;
        }
        return total;
    }
}