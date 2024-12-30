class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int>res;
        int n = nums1.size();
        int n2 = nums2.size();
        for(int i=0;i<n;i++){
            res.push_back(nums1[i]);
        }
        for(auto i: nums2){
            res.push_back(i);
        }
        sort(res.begin(),res.end());
        int tot = n+n2;
        if(tot%2 != 0){
            return (double)res[tot/2];
        }
        else{
            int l = res[tot/2 -1];
            int r = res[tot/2];
            return (double)(l+r)/2.0;
        }

    }
};