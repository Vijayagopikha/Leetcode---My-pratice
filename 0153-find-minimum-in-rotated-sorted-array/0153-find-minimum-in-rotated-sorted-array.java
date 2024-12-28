class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        /*while(left < right) {
            int mid = (left + right)/ 2;

            if(nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];*/
        if(nums[0] < nums[right]) return nums[0];
        while(left < right){
            int mid = (left+right)/2;
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            else if(nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            else{
                if(nums[0]>nums[mid]){
                    right = mid;
                }
                else{
                    left = mid+1;
                }
            }
        }
        return nums[left];
    }
}