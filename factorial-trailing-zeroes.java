class Solution {
    public int trailingZeroes(int n) {
        int co=0;
        while(n>=5)
        {
            n=n/5;
            co+=n;
        }
        return co;
    }
}
