class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        int c = 0;
        long pre = 0;
        int n = nums.length;
        for(int i = n-1;i>=0;i--){
           pre+=(long)nums[i];
           if(pre > 0){
            c++;
           }
           else{
            break;
           }
        }
        return c;
    }
}