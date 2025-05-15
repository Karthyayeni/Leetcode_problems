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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        Deque<TreeNode> dq  = new LinkedList();
        boolean flag = true;

        if(root == null){
            return result;
        }    
        dq.add(root);

        while(!dq.isEmpty()){
            int size = dq.size();
            List<Integer> arl = new ArrayList();

            if(flag){
                while(size > 0){
                    TreeNode node = dq.pollFirst();
                    arl.add(node.val);
                    if(node.left != null){
                        dq.addLast(node.left);
                    }
                    if(node.right != null){
                        dq.addLast(node.right);
                    }
                    size--;
                }
                flag = false;
            }
            else{
                while(size > 0){
                    TreeNode node = dq.pollLast();
                    arl.add(node.val);
                    if(node.right != null){
                        dq.addFirst(node.right);
                    }
                    if(node.left != null){
                        dq.addFirst(node.left);
                    }
                    size--;
                }
                flag = true;
            }
            result.add(arl);
        }
        return result;
    }
}