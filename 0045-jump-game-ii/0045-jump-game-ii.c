int jump(int* nums, int numsSize) {
    int jump = 0;
    int l = 0;
    int r = 0;
    while(r < numsSize - 1){
        int dist = 0;
        for(int i = l; i <= r; i++){
            dist = fmax(dist,i + nums[i]);
        }
        l = r + 1;
        r = dist;
        jump++;
    }
    return jump;
}