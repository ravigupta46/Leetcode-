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
    int ans=0;
    public int solve(TreeNode root){
        if(root==null) return Integer.MIN_VALUE;
        int left=solve(root.left);
        int right=solve(root.right);
        if(root.val>=Math.max(left,right)){
            ans++;

        }
        return Math.max(root.val,Math.max(right,left));
    }
    public int countDominantNodes(TreeNode root) {
        solve(root);
        return ans;
    }
}