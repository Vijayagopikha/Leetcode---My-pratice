class Solution {
    public int search(int[] nums, int target) {
      
        int idx = index(nums);
        int ans = bsearch(0, idx,target,nums);
        if(ans!=-1){
            return ans;
        }
        else
        return bsearch(idx, nums.length-1,target,nums);
           
        }
        
    
    int index(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        
        if(nums[0] < nums[r]){
           return 0;
        }
        while(l<r){
            int mid = (l+r)/2;
            if(nums[mid] > nums[mid+1])
               return  mid+1;
            else if(nums[mid-1] > nums[mid]){
                return mid;
            }
            else{
                if(nums[0] > nums[mid]){
                    r = mid-1;
                }
                else{
                    l = mid+1;
                }
            }
        }
        
       return l;
    }
    int bsearch(int l, int r,int target,int[] nums){
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return -1;
    }
}