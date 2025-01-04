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
    int minDepth(TreeNode* root) {
        if(root==NULL) return 0;
        queue<TreeNode*> q;
        q.push(root);
        int level = 0;
        while(!q.empty()){
            int c = q.size();
            while(c!=0){
                TreeNode *cur = q.front();
                q.pop();
                if(cur->left==NULL && cur->right==NULL){
                    return level+1;

                }
                if(cur->left) q.push(cur->left);
                if(cur->right) q.push(cur->right);
                 c--;
            }
            level++;
        }
        return 0;
    }
};