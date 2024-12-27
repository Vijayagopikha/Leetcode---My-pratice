class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        int c=0;
        unordered_map<int,int>m;
        for(auto i : nums){
            c = c + m[i];
            m[i] = m[i] + 1;
        }
        return c;
    }
};