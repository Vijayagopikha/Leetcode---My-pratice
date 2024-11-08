class Solution {
    public int missingNumber(int[] a) {
       /* int res = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            res += i - nums[i];
        }
        
        return res;*/
        int n=a.length;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
           if(a[i]!= i){
            return i;
           }
        }   
        return n;    
    }
}