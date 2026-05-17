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
    int diameter=0;
    int maxDepth(TreeNode root){
        if (root==null)return 0;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        if (diameter<left+right)diameter=right+left;
        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null)return 0;
        maxDepth(root);
        return diameter ;
    }
}