/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        if (root.left != null || root.right != null){
            TreeNode aux = root.left;
            root.left = root.right;
            root.right = aux;
            TreeNode left = invertTree(root.left);
            TreeNode right = invertTree(root.right);
        }
        return root;
    }
}
