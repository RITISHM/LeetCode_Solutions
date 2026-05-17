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
    int sum=0;
    void sumNumber(TreeNode root, int num){
        if (root==null)return ;
        if (root.left==null&& root.right==null){
            sum+=(num*10+root.val);
            return ;
        }

        sumNumber(root.left,num*10+root.val);
        sumNumber(root.right,num*10+root.val);


    }
    public int sumNumbers(TreeNode root) {
        sumNumber(root,0);
        return sum;
    }
}