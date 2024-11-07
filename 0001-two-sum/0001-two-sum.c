/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int n, int target, int* rs) {
    int *res = (int *)malloc(sizeof(int)*2);
    *rs = 2;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if((nums[i]+nums[j])==target){
                res[0]=i;
                res[1]=j;
                return res;
            }
        }
    }
    return res;
}