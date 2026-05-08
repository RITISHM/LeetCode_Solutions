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
    public static void preorder(TreeNode root, List<Integer> res){
        if(root==null) {
        res.add(null);
        return ;
        }
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> list1=new LinkedList<>(), list2= new LinkedList<>();

        preorder(p,list1);preorder(q,list2);
        return list1.equals(list2);
    }
}