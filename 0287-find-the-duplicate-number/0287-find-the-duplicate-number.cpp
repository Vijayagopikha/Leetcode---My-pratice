class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        unordered_set<int>s;
        for(auto i : nums){
            if(s.count(i)==1){
                return i;
            }
            s.insert(i);
        }
        return -1;
    }
};