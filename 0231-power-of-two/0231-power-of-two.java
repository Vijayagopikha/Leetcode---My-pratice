/*class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
}*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return 1073741824 % n == 0;
    }
}
