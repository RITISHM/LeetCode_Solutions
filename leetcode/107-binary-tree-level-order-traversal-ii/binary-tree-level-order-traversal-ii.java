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
    public static void bfs(Queue <TreeNode> q, List<List<Integer>> res){
        int size =q.size();
        if (size==0)return ;

        List<Integer> list=new LinkedList<>();
        for (int i=0 ; i<size ; i++){
            TreeNode curr= q.poll();
            list.add(curr.val);
            if (curr.left!=null) q.offer(curr.left);
            if (curr.right!=null) q.offer(curr.right);
        }
        bfs(q,res);
        res.add(list);
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

       List<List<Integer>> res= new LinkedList<>();
       if (root==null)return res;
       
       Queue <TreeNode> q =new LinkedList <>();
       q.offer(root);
        bfs(q,res);
        return res;
    }
}