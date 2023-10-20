
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return res;
        if(root!=null) q.add(root);
        int f=1;
        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode ele=q.poll();
                level.add(ele.val);
                if(ele.left!=null)
                {
                    q.add(ele.left);
                }
                if(ele.right!=null)
                {
                    q.add(ele.right);
                }
                    
                
            }
            if(f%2==0){
                Collections.reverse(level);
           
            }
            
                res.add(level);
            
            f=f+1;
        }
        return res;
    }
}
