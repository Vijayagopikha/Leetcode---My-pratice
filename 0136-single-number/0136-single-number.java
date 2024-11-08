class Solution {
    public int singleNumber(int[] a) {
        /*int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;*/
        Arrays.sort(a);
        int n = a.length;
        for(int i=0;i<n-1;i=i+2){
            if(a[i]!=a[i+1])
                return a[i];
        }
        return a[n-1];

    }
}