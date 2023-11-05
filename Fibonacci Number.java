class Solution {
    public int fib(int n) {
      if(n<2) return n;
      int a=0;
      int b=1;
      int cur=0;
      for(int i=2;i<=n;i++)
      {
          cur=a+b;
          a=b;
          b=cur;
      }  
      return cur;
    }
}
