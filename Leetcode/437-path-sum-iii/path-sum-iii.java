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
    int noOfPath(TreeNode root , long targetSum) {
        if (root==null)return 0;
        int path=0;
        if (root.val==targetSum)path++;
         path+=noOfPath(root.left,targetSum-root.val)+noOfPath(root.right,targetSum-root.val);
        return path;
    }
    public int pathSum(TreeNode root, int targetSum) {
        if (root==null)return 0;

        int count= noOfPath(root,(long) targetSum);
        count +=pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
        return count;
    }
}