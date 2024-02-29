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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null)
        {
            q.add(root);
        }
        int k=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            int preEven=0;
            int preOdd=100000;
            for(int i=0;i<size;i++)
            {
                TreeNode temp=q.poll();
                if(k%2==0)
                {
                    if(temp.val%2==0)
                    {
                        return false;
                    }
                if(preEven>=temp.val) return false;
                

                preEven=temp.val;
                }
                else
                {
                    if(temp.val%2!=0)
                    {
                        return false;
                    }
                    if(preOdd<=temp.val) return false;
                preOdd=temp.val;
                }
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);

            }
            k++;
        }
        return true;
    }
}
