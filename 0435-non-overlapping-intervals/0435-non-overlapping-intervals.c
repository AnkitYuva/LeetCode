int compare(const void *a,const void *b){
    return (*(int**)a)[1] - (*(int**)b)[1];
}
int eraseOverlapIntervals(int** intervals, int intervalsSize, int* intervalsColSize) {
    int count = 1;
    qsort(intervals,intervalsSize,sizeof(int*),compare);
    int endtime = intervals[0][1];
    for(int i = 1; i < intervalsSize; i++){
        if(intervals[i][0] >= endtime){
            count++;
            endtime = intervals[i][1];
        }
    }
    return intervalsSize - count;
}