class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int[] res = new int[2];
        while(l<r){
           int sum = nums[l] + nums[r];
           if(sum == target){
            res[0] = l+1;
            res[1] = r+1;
            return res;
           }
           if(target < sum){
            r--;
           }
           else{
            l++;
           }


        }
       return res;
    }
}