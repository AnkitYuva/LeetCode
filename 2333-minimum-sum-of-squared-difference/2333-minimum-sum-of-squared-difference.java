class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long ans = 0L;
        int max = 0;
        int k = k1 + k2;
        for(int i = 0; i < nums1.length; i++){
            max = Math.max(max,Math.abs(nums1[i] - nums2[i]));
        }
        int[] freq = new int[max + 1];
        for(int i = 0; i < nums1.length; i++){
            freq[Math.abs(nums1[i] - nums2[i])]++;
        }
        for(int i = max; i >= 1 && k > 0; i--){
            int min = Math.min(k,freq[i]);
            k -= min;
            freq[i] -= min;
            freq[i-1] += min;
        }
        for(int i = max; i >= 1; i--){
            ans += (long)i*i*freq[i];
        }
        return ans;
    }
}