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

        List<List<Integer>> ans = new ArrayList<>();
         if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int level_size = q.size();
            List<Integer> li = new ArrayList<>();
            for (int i = 0; i < level_size; i++) {
                TreeNode fr = q.poll();

                li.add(fr.val);
                if (fr.left != null) {
                    q.offer(fr.left);
                }
                if (fr.right != null) {
                    q.offer(fr.right);
                }
            }
            ans.add(li);
        }
        return ans;

    }
}