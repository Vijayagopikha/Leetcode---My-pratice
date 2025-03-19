class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int usedBits = 0;
        int max = 0;
        for(r = 0; r<n;r++){
            while((usedBits & nums[r]) != 0){
                usedBits ^= nums[l];
                l++;
            }
            usedBits |= nums[r];
            max = Math.max(max, r-l+1);
           
        }
        return max;
    }
}