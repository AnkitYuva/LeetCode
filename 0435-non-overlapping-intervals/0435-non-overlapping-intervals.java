class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        Arrays.sort(arr,(a,b) -> Integer.compare(a[1],b[1]));
        int count = 1;
        int endtime = arr[0][1];
        for(int i = 1; i < arr.length; i++){
            if(arr[i][0] >= endtime){
                count++;
                endtime = arr[i][1];
            }
        }
        return arr.length - count;
    }
}