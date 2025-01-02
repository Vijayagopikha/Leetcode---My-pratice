class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
       
       /* int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }   */
        
        
        k = k%n;
        int j = 0;
        int[] t = new int[n];
        for(int i=0;i<n-k;i++){
            t[i+k] = nums[i];
        }
        for(int i = n-k;i<n;i++){
            t[j++] = nums[i];
        }   
        for(int i=0;i<n;i++){
            nums[i] = t[i];
        }
    }
}