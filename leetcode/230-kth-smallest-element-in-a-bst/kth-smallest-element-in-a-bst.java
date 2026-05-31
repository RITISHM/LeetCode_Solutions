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
    static int count;
    static int res;
     void helper (TreeNode root){
        if (root==null)return ;
        helper(root.left);
        if (res!=-1)return ;
        count --;
        if (count==0){
            res=root.val;
            return;
        }
        helper(root.right);
        return;
    }
    public int kthSmallest(TreeNode root, int k) {
        count =k;
        res=-1;
        helper(root);
        return res;
    }
}