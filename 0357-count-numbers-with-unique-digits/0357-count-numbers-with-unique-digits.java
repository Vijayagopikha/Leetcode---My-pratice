class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0 ) return 1;
        int unique = 10 ; //if n == 1 ..0 to 9..10
        int cur = 9;  //for first digit 1-9;
        int avai = 9; //for second 0-9 except first;
        for(int i=2;i<=n;i++){  //why i = 2...if n= 1 means directly 10..so i = 2
            cur *= avai;
            unique+=cur;
            avai--;
        }
        return unique;
    }
}