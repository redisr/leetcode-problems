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
    int cont = 0;
    public int kthSmallest(TreeNode root, int k) {
        return kth(root, k).val;
    }
    
    public TreeNode kth(TreeNode root, int k){
        if (root == null){
            return null;  
        }
        TreeNode left = kth(root.left, k);
        cont ++;
        if (cont == k){
            return root;
        }
        TreeNode right = kth(root.right, k);
        return (left == null) ? right : left;
    }
}
