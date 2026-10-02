int helper(int* nums,int start,int end){
    int one = nums[start];
    int two = fmax(nums[start],nums[start+1]);
    int result = two;
    for(int i = start + 2; i <= end; i++){
        result = fmax(two,one + nums[i]);
        one = two;
        two = result;
    }
    return result;
}
int rob(int* nums, int numsSize) {
    int n = numsSize;
    if(n == 1){
        return nums[0];
    }
    if(n == 2){
        return fmax(nums[0],nums[1]);
    }
    return fmax(helper(nums,0,n-2),helper(nums,1,n-1));
}