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
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return res;
        if(root!=null) q.add(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode ele=q.poll();
                if(ele.left!=null)
                {
                    q.add(ele.left);
                }
                if(ele.right!=null)
                {
                    q.add(ele.right);
                }
                level.add(ele.val);
            }
        res.add(level);
        }
        return res;
    }
}
