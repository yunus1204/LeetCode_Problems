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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        helper(root);
        return diameter;
    }
    public int helper(TreeNode root)
    {
        if(root==null) return 0;
        int l=helper(root.left);
        int r=helper(root.right);
        diameter=Math.max(l+r,diameter);
        return Math.max(l,r)+1;

    }
}
