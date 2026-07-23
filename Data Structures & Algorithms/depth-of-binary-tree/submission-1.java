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
    public int maxDepth(TreeNode root) {
        if(null == root) {
            return 0;
        }
        return calculateMaxDepth(root, 1);
    }

    public int calculateMaxDepth(TreeNode root, int currentDepth) {
        if(null == root) {
            return currentDepth-1;
        }

        int leftDepth = calculateMaxDepth(root.left, currentDepth + 1);
        int rightDepth = calculateMaxDepth(root.right, currentDepth + 1);
        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }
}
