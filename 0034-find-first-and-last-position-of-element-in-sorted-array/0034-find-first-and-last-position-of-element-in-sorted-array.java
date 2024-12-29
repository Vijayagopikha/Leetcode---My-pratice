class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int []res = new int[2];
        Arrays.fill(res,-1);
        /*res[0] = -1;
        res[1] = -1;*/
        while(left<=right){
            int mid = (left+right)/2;
           
            if(nums[mid] == target){
                res[0] = mid;
                res[1] = mid;
                int  i = mid-1;
                while(i>=0 && (nums[mid] == nums[i])){
                    res[0] = i;
                    i--;
                }
                int j = mid+1;
                while(j <n && (nums[j] ==  nums[mid])){
                    res[1] = j;
                    j++;
                }
                
                return res;
                
               
                /* else if(mid-1 >=0   && mid+1<n &&(nums[mid-1] ==  nums[mid+1]) ){
                    res[0] = mid -1;
                    res[1] = mid+1;
                    return res;
                }
                 else if(mid+1 <n && (nums[mid+1] ==  nums[mid])){
                    res[0] = mid;
                    res[1] = mid+1;
                    return res;
                }
                else if(mid-1 >=0 && (nums[mid-1] ==  nums[mid])){
                    res[0] = mid-1;
                    res[1] = mid;
                    return res;
                }
               
                else{
                    res[0] = mid;
                    res[1] = mid;
                    return res;
                }*/
            }
            else if (nums[mid] < target){
                 left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return res;
    }
}