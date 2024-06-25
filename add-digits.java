class Solution {
    public int addDigits(int num) {
        int sum=helper(num);
        while(sum>=10){
        if(sum>=10)
        {
            sum=helper(sum);
        }
        }
        return sum;
    }
    public int helper(int n)
    {
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
}
