class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int  n = weights.length;
        int max = weights[0];
        int sum = 0;
       for(int i : weights){
        sum+=i;
        if(max<i){
            max=i;
        }
       }
      
       int left  = max;
       int right = sum;
       while(left<right){
        int mid = (left+right)/2;
        int wei = 0;
        int day = 1;
        for(int i : weights){
            if(wei+i > mid){
                day++;
                wei = 0;
            }
            wei +=i;
            
        }
        if(day>days){
            left = mid+1;
        }
        else{
            right = mid;
        }
       }
       return left;
    }
}