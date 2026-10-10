long long minSumSquareDiff(int* nums1, int nums1Size, int* nums2, int nums2Size, int k1, int k2) {
    long long ans = 0;
    int max = 0;
    int k = k1 + k2;
    for(int i = 0; i < nums1Size; i++){
        max = fmax(max,fabs(nums1[i] - nums2[i]));
    }
    int freq[max + 1];
    for(int i = 0; i <= max; i++){
        freq[i] = 0;
    }
    for(int i = 0; i < nums1Size; i++){
        freq[(int)fabs(nums1[i] - nums2[i])]++;
    }
    for(int i = max; i >= 1 && k > 0; i--){
        int min = fmin(k,freq[i]);
        k -= min;
        freq[i] -= min;
        freq[i-1] += min;
    }
    for(int i = max; i >= 1; i--){
        ans += (long)i*i*freq[i];
    }
    return ans;
}