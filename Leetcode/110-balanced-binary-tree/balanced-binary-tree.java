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
    int[] checkbalance (TreeNode root){
        int []ans =new int [2];
        if (root==null)return ans;
        int [] right =checkbalance(root.right);
        int []left= checkbalance(root.left);
        if (left[0]==-1||right[0]==-1){ans[0]=-1; return ans;}
        if (Math.abs(left[1]-right[1])>1){
            ans [0]=-1;
            return ans;
        }
        ans [1]=1+Math.max(left[1],right[1]);
        return ans ; 

    }
    public boolean isBalanced(TreeNode root) {
        int []ans= checkbalance (root);
        return ans[0]==0?true:false;
    }
}