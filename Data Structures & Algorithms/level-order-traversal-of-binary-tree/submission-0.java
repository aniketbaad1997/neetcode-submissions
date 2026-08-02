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
        int depth = findDepth(root);
        List<List<Integer>> levelOrder = new ArrayList<>(depth);
        for(int i=0;i<depth;i++) {
            levelOrder.add(new ArrayList<>());
        }

        traverse(root, levelOrder, 0);
        return levelOrder;
    }

    public int findDepth(TreeNode root) {
        if(null == root) {
            return 0;
        }
        return 1 + Math.max(findDepth(root.left), findDepth(root.right));
    }

    public void traverse(TreeNode root, List<List<Integer>> levelOrder, int level) {
        if(null == root) {
            return;
        }
        levelOrder.get(level).add(root.val);
        traverse(root.left, levelOrder, level+1);
        traverse(root.right, levelOrder, level+1);
    }
}
