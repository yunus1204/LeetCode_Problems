class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        int n=nums2.length;
        for(int i=0;i<n;i++)
        {
            if(st.isEmpty())
            {
                st.push(nums2[i]);
            }
            else
            {
                while(!st.isEmpty() && nums2[i]>st.peek())
                {
                    map.put(st.peek(),nums2[i]);
                    st.pop();
                    f nb
                }
                
                st.push(nums2[i]);  

            }
        }
        while(!st.isEmpty())
        {
            map.put(st.pop(),-1);
        }
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i]=map.get(nums1[i]);
        }
        return nums1;
    }
}
