class Solution {
    int compute(int n){
        int sum = 0;
        while(n!=0){
            int num = n%10;
            sum+=num*num;
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int fast = n, slow = n;
       do{
            slow = compute(slow);
            fast = compute(fast);
            fast = compute(fast);

       }while(slow!=fast);
       if(slow == 1){
        return true;
       }
       return false;
    }
}