class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        int n=temperatures.length;
        int index[]=new int[n];
        Arrays.fill(index,0);
        for(int i=0;i<n;i++)
        {
            if(st.isEmpty()){
                st.push(i);
            }
            else if(!st.isEmpty())
            {
                while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()])
                {
                    index[st.peek()]=i-st.peek();
                    st.pop();
                                    }
             
                st.push(i); 
           
               
                
               
            }
        }
        return index;
    }
}
