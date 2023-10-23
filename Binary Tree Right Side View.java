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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return l;
        else q.add(root);
            TreeNode ele=null;
        while(!q.isEmpty())
        {
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                 ele=q.poll();
                if(ele.left!=null)
                {
                    q.add(ele.left);
                }
                if(ele.right!=null)
                {
                    q.add(ele.right);
                }
            }
            l.add(ele.val);

        }
        return l;
    }
}
