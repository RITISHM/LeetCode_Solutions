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
    void fixer(TreeNode root){
        TreeNode right=root.right;
        TreeNode left=root.left;
        if (root.left==null){
            root.left=right;
            return ;
        }
        while(left.right!=null){
            left=left.right;
        }
        left.right =right;

    }
    void helper (TreeNode root,int key){
        if (root==null)return;
        if (root.left!=null&&root.left.val==key){
            fixer(root.left);
            root.left=root.left.left;
            return ;
        }
        if (root.right!=null&&root.right.val==key){
            fixer(root.right);
            root.right=root.right.left;
            return ;
        }
        if (root.val>key)helper(root.left,key);
        else helper(root.right,key);
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode dummy=new TreeNode(Integer.MAX_VALUE);
        dummy.left=root;
        helper(dummy,key);
        return dummy.left;
    }
}