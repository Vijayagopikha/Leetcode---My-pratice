class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        // Check if it's impossible to form m bouquets
        if (m * k > n) {
            return -1;
        }

        // Find the maximum bloom day
        int max = 0;
        for (int day : bloomDay) {
            max = Math.max(max, day);
        }

        int l=1;
        int r = max;
        int min =-1;
        while(l<=r){
            int mid = (l+r)/2;
            int bc=0,nob=0;
            for(int i: bloomDay){
                if(i<=mid) ++bc;
                else bc=0;
                if(bc==k){
                    nob++;
                    bc=0;
                }
            }
            if(nob>=m){
                r = mid-1;
                min = mid;
            }
            else{
                l=mid+1;
            }
        }
        return min;
    }
}