class Solution {
public:
   
    bool isHappy(int n) {
        unordered_set<int>s;
        do{
            int sum = 0;
             while(n!=0){
            int num = n%10;
            sum+=num*num;
            n/=10;
        }
        if(s.count(sum)==1){
            return false;
        }
        s.insert(sum);
        n = sum;
        }while(n!=1);
        return true;
    }
};