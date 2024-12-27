class Solution {
public:
    long long interchangeableRectangles(vector<vector<int>>& rectangles) {
        long long c = 0;
        unordered_map<double,int>m;
        for(auto i : rectangles){
            double r = (double) i[0]/i[1];
            c = c + m[r];
            m[r] = m[r] + 1; 
        }
        return c;
    }
};