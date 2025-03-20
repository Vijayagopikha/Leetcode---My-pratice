/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }  
 */
class Solution {
    public void level(TreeNode n1, TreeNode n2, int lev){
        if(n1==null || n2==null)
          return;
        if(lev%2!=0){
            int val = n1.val;
            n1.val = n2.val;
            n2.val = val;
        }
        level(n1.left, n2.right, lev+1);
        level(n1.right, n2.left, lev + 1);
    }
    public TreeNode reverseOddLevels(TreeNode root) {
          level(root.left, root.right, 1);
          return root;

    }
}