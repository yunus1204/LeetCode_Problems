class Solution {
    public int calculate(String s) {
       char arr[]=s.toCharArray();
       Stack<Integer> st=new Stack<>();
       int n=arr.length;
       int num=0;
       char sign='+';
       for(int i=0;i<n;i++)
       {
           char c=arr[i];
           if(Character.isDigit(arr[i]))
           {
               num=(num*10)+(int)(arr[i]-'0');
           }    
               if(!Character.isDigit(arr[i]) && c!=' ' || i==n-1)
               {
                   if(sign=='+')
                   {
                       st.push(num);
                   }
                   else if(sign=='-')
                   {
                       st.push(num*-1);
                   }
                   else if(sign=='*')
                   {
                       st.push(st.pop()*num);
                   }
                   else if(sign=='/')
                   {
                       st.push(st.pop()/num);
                   }
           num=0;
           sign=c;
               }

       }
       int tot=0;
       for(int i:st)
       tot+=i;
       return tot;
    }
}
