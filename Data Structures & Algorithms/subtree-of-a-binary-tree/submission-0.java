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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(null == root) {
            return false;
        }
        boolean isTreeMatching = isTreeMatching(root, subRoot);
        return isTreeMatching ? isTreeMatching : (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));
    }

    public boolean isTreeMatching(TreeNode root, TreeNode subRoot) {
        if(null == root && null == subRoot) {
            return true;
        } else if(null != root && null != subRoot && root.val == subRoot.val) {
            return isTreeMatching(root.left, subRoot.left) &&
                isTreeMatching(root.right, subRoot.right);
        } else {
            return false;
        }
    }
}
