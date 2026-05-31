/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null)return root;
        TreeNode min=(p.val<q.val)?p:q;
        TreeNode max=(p.val>q.val)?p:q;
        if (root.val>=min.val&&root.val<=max.val)return root;
        
        return  root.val>max.val?lowestCommonAncestor(root.left,min,max):lowestCommonAncestor(root.right,min,max);
    }
}