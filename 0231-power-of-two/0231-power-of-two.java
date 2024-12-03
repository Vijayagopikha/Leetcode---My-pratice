/*class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
}*/

/*class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return 1073741824 % n == 0;
    }
}*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1) return false;
        while(n>1){
            if(n%2!=0)
            return false;
            n=n/2;
        }
        return true;
    }
    }