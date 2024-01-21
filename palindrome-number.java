class Solution {
    public boolean isPalindrome(int x) {
        int t=0;
        int rem;
        int y=x;
        while(y>0){
            rem=y%10;
            t=t*10+rem;
            y=y/10;
        }
        return t==x;
    }
}
