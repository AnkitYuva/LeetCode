int compare(const void *a,const void *b){
    return (*(int*)a - *(int*)b);
}
int threeSumClosest(int* nums, int numsSize, int target) {
    qsort(nums,numsSize,sizeof(int),compare);
    int res = nums[0] + nums[1] + nums[2];
    for(int i = 0; i < numsSize; i++){
        int j = i + 1;
        int k = numsSize - 1;
        while(j < k){
            int sum = nums[i] + nums[j] + nums[k];
            if(fabs(target - sum) < fabs(target - res)){
                res = sum;
            }
            if(sum == target){
                return sum;
            }else if(sum < target){
                j++;
            }else{
                k--;
            }
        }
    }
    return res;
}