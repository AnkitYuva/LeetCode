class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int n = nums2.length;
    int m = nums1.length;
    int[] result= new int[m+n];
        for(int i = 0; i < m; i++){
            result[i] = nums1[i];
        }
        for(int i = 0; i < n; i++){
            result[m+i] = nums2[i];
        }
        Arrays.sort(result);
        int low = (result.length-1)/2;;
        int high = result.length/2;
        double mid = (result[low]+result[high])/2.0;
        return mid;
    }
}