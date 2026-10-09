void reverse(int* nums,int start,int end){
    while(start < end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}
void nextPermutation(int* nums, int numsSize) {
    int pivot = -1;
    for(int i = numsSize - 2; i >= 0; i--){
        if(nums[i] < nums[i+1]){
            pivot = i;
            break;
        }
    }
    if(pivot == -1){
        reverse(nums,0,numsSize-1);
        return;
    }
    for(int i = numsSize-1; i >= 0; i--){
        if(nums[i] > nums[pivot]){
            int temp = nums[i];
            nums[i] = nums[pivot];
            nums[pivot] = temp;
            break;
        }
    }
    reverse(nums,pivot+1,numsSize-1);
}