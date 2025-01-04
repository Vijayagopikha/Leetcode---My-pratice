/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
         vector<vector<int>> res;
        if(root==NULL) return res;
        queue<TreeNode*> q;
        q.push(root);
        int flag = 1;
        int level = 0;
        while(!q.empty()){
            vector<int> v;
            int c = q.size();
            while(c!=0){
                TreeNode *cur = q.front();
                q.pop();
                v.push_back(cur->val);
              
                if(cur->left) q.push(cur->left);
                if(cur->right) q.push(cur->right);
                
                 c--;
            }
            if(flag==0) reverse(v.begin(),v.end());
            flag = !flag;
            res.push_back(v);
            level++;
        }
        return res;
    }
};