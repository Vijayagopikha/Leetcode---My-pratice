int search(int* nums, int n, int target) {
   /* for(int i=0;i<n;i++){
       if(nums[i] == target){
        
        return i;
       }
    }
   return -1;*/
    int l = 0;
    int r = n-1;
    int mid = (l+r)/2;
    while(l<=r){
    if(nums[mid] ==  target){
        return mid;
    }
    if(target < nums[mid]){
        r = mid-1;
        mid = (l+r)/2;

    }
    else{
        l = mid+1;
        mid = (l+r)/2;
    }
    }
    return -1;
 
}