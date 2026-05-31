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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root==null)return root;

        if (root.val>key){ //Transverse left subtree 
            root.left=deleteNode(root.left,key);
            
        } 
        else if (root.val<key){ //Transverse right subtree
            root.right=deleteNode(root.right,key);
        }

        //the current root is the key
        else{
            //right subtree is not exist 
            if (root.right==null)return root.left;
            //left subtree is not exist
            if (root.left==null)return root.right;

            //bot right ans left exists 
            TreeNode right=root.right;
            TreeNode left =root.left;

            //putting the right of the subtree to the right leaf of the left subtree
            TreeNode temp=left;
            while (temp.right!=null)temp=temp.right;
            temp.right=right;
            return left;
        }
        return root;
    }
}