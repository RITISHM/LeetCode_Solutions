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
     int helper (TreeNode root){
        if (root==null)return -1;
        int res=-1;
        res=helper(root.left);
        if (res!=-1)return res ;
        count --;
        if (count==0){
            return root.val;
        }
        
        return helper(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        count =k;
        return helper(root);
    }
}