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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) 
        queue.offer(root);
        while(!queue.isEmpty()){
            int l = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i < l;i++){
                TreeNode current = queue.poll();
                list.add(current.val);
                if(current.left != null)
                queue.offer(current.left);
                if(current.right != null)
                queue.offer(current.right);
            }
            res.add(list);
        }
        return res;
    }
}