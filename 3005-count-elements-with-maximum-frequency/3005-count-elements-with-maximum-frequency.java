class Solution {
    public int maxFrequencyElements(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int[] count = new int[101];
        for(int i : nums){
            count[i]++;
            if(count[i] > max){
                max = count[i];
            }
        }
        for(int i : nums){
            if(count[i] == max){
                sum++;
            }
        }
        return sum;
    }
}