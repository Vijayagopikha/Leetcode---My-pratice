
class Solution {
    public int smallestEvenMultiple(int n) {
        //return (n%2==0)? n : n*2;

        return (n&1)==0 ? n: n*2;
    }
}